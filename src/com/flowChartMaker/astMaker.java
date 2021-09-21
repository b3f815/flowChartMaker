package com.flowChartMaker;


import com.antlr.FCMGrammarLexer;
import com.antlr.FCMGrammarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class astMaker {
    private static boolean connectFromIfEndings = false;
    private static ArrayList<String> ifEndings = new ArrayList<String>();
    private static String indent = "";
    private static boolean doLabel = false;
    private static String lastElement = null;
    private static final StringBuilder dotFile = new StringBuilder("digraph{\n");
    private static FCMGrammarParser fcmGrammarParser;
    private static CommonTokenStream commonTokenStream;
    private static FCMGrammarLexer fcmGrammarLexer;
    private static CharStream charStream;
    private static String node = null;
    public static void main(String[] args) throws IOException {

        //Read Input file and working the lexer and parser on it.
        charStream = CharStreams.fromFileName("./Input/ip.c");
        fcmGrammarLexer = new FCMGrammarLexer(charStream);
        commonTokenStream = new CommonTokenStream(fcmGrammarLexer);
        fcmGrammarParser = new FCMGrammarParser(commonTokenStream);


        //printing intended code and creating the dotFile for graphviz.
        handle(fcmGrammarParser.program());
        dotFile.append("}");
        System.out.println(dotFile);

        //Write to File
        File DotFile = new File("output/DotFile.dot");
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(DotFile));
            writer.write(dotFile.toString());
        } finally {
            if (writer != null) writer.close();
        }
        //create png from DotFile

        String command = "dot -T png ./output/DotFile.dot -o ./output/flow.png";
        Runtime.getRuntime().exec(command);
    }
    public static void handle(ParseTree tree) {

        switch (tree.getClass().getSimpleName()){
            //The main context
            case "ProgramContext":

                //Recursively handle sub-contexts - DFS fashion.
                for(int i= 0; i< tree.getChildCount();i++){
                    handle(tree.getChild(i));
                }
                break;
            //Handle each individual line other than conditionals
            case "LineContext":
                //Create a last element of none exists

                if (lastElement == null) {
                    if(tree.getChildCount() > 2){ //To check if this is a complex statement eg : function call.
                        node = createNode(tree.getChild(0).getText() + tree.getChild(1).getText()+tree.getChild(2).getText()+tree.getChild(3).getText(),"oval");
                    }
                    else{
                        node = createNode(tree.getChild(0).getText(), "oval");
                    }
                    lastElement = node;
                }

                else { //assigning oval shape to last node
                    if(tree.getSourceInterval().b >= commonTokenStream.getNumberOfOnChannelTokens() - 2 ){
                        if(tree.getChildCount() > 2){
                            node = createNode(tree.getChild(0).getText() + tree.getChild(1).getText()+tree.getChild(2).getText()+tree.getChild(3).getText(),"oval");
                        }
                        else{
                            node = createNode(tree.getChild(0).getText(), "oval");
                        }
                    }
                    //assign box shapes to new nodes
                    else{
                        if(tree.getChildCount() > 2){
                            node = createNode(tree.getChild(0).getText() + tree.getChild(1).getText()+tree.getChild(2).getText()+tree.getChild(3).getText(),"box");
                        }
                        else{
                            node = createNode(tree.getChild(0).getText(), "box");
                        }

                    }

                    connectFrom(lastElement, node,doLabel);

                    lastElement = node;
                }

                //Converging from if-else if -else blocks to next statement
                if(connectFromIfEndings == true){
                    for(String s : ifEndings){
                        if (tree.getChildCount() > 2){
                            connectFrom(s,getNode(tree.getChild(0).getText() + tree.getChild(1).getText()+tree.getChild(2).getText()+tree.getChild(3).getText()),false);
                        }
                        else{
                            connectFrom(s,getNode(tree.getChild(0).getText()),false);
                        }
                    }
                    connectFromIfEndings = false;
                    ifEndings.clear();
                }

                //print indented code
                System.out.println(indent + tree.getChild(0));
                break;

            //Handle While block
            case "WhileBlockContext" :
                doLabel = true; //Label for condition inside while.
                System.out.print(indent + "While");
                for(int i = 0; i< tree.getChildCount();i++){
                    handle(tree.getChild(i));
                }

                //Loop back to while : condition and setting flow to normal afterwards
                if(tree.getChild(2).getChildCount()>2){
                    node = getNode(tree.getChild(2).getChild(0).getText()+tree.getChild(2).getChild(1).getText()+tree.getChild(2).getChild(2).getText());
                }
                else{
                    node = getNode(tree.getChild(2).getText());
                }

                connectFrom(lastElement,node,false);
                lastElement = node;
                break;

            //Terminal nodes.
            case "TerminalNodeImpl":
                break;

            //Handling Block/Compound statements
            case "BlockContext":
                String oldIntent = indent;
                indent += "\t";
                for(int i = 0; i< tree.getChildCount();i++){
                    handle(tree.getChild(i));
                }
                indent = oldIntent;

                //If or else-if end statments will be added to ifEndings to converge from them once they are processed.
                if(tree.getParent().getClass().getSimpleName().equalsIgnoreCase("IfBlockContext")
                  || tree.getParent().getClass().getSimpleName().equalsIgnoreCase("elseIfBlockContext")){
                    ifEndings.add(node);
                }
                //Else statements mean end of the block,converge after this execution.
                if(tree.getParent().getClass().getSimpleName().equalsIgnoreCase("elseBlockContext")){
                   lastElement = node;
                    connectFromIfEndings = true;
                }
                break;

            //Else-If blocks
            case "ElseifBlockContext":
                doLabel = true;
                // Start chaining from else-if condition
                node = getNode(tree.getParent().getChild(2).getText());
                lastElement = node;
                System.out.print(indent + "Else If");
                for(int i = 0; i< tree.getChildCount();i++){
                    handle(tree.getChild(i));
                }
                break;

            //If Block : if || if..elseIf
            case "IfBlockContext":
                doLabel = true;
                System.out.print(indent + "If");
                for(int i = 0; i< tree.getChildCount();i++){
                    handle(tree.getChild(i));
                }
                //lastElement = getNode(tree.getChild(2).getText());
                break;

            //Else Block
            case "ElseBlockContext":

                System.out.println(indent+ "else");
                node = getNode(tree.getParent().getChild(2).getText());
                lastElement = node;
                for(int i = 0; i< tree.getChildCount();i++){
                    handle(tree.getChild(i));
                }

                break;

            //Conditional statements,inside if,else_if or while
            case "CondContext":

                //create a new node with diamond shape
                if(tree.getChildCount() > 2){
                    node = createNode(tree.getChild(0).getText() + tree.getChild(1).getText()+tree.getChild(2).getText(),"diamond");
                }
                else{
                    node = createNode(tree.getChild(0).getText(), "diamond");
                }
                if(connectFromIfEndings == true){
                    for(String s : ifEndings){
                        if (tree.getChildCount() > 2){
                            connectFrom(s,getNode(tree.getChild(0).getText() + tree.getChild(1).getText()+tree.getChild(2).getText()),false);
                        }
                        else{
                            connectFrom(s,getNode(tree.getChild(0).getText()),false);
                        }

                    }
                    connectFromIfEndings = false;
                    ifEndings.clear();
                }
                else{
                    connectFrom(lastElement,node,false);
                }

                lastElement = node;
                System.out.println(" condition : " +tree.getChild(0) );
                break;
            default :
                System.out.println(tree.getClass().getSimpleName());
        }


    }

    //create an edge
    public static void connectFrom(String lastElement, String currentElement,boolean label){
        if(label == true){
            dotFile.append(lastElement  +" -> " + currentElement +"[label = true]\n"); // give "true" label to edge
            doLabel = false;
        }
        else{
            dotFile.append(lastElement  +" -> " + currentElement +"\n");
        }

    }
    //create a node
    public static String createNode(String name, String shape){
        dotFile.append("\"" + name + "\"" + "[shape=" + shape + "]\n");
        return "\"" + name + "\"";
    }

    //get a node by its name formatted.
    public static String getNode(String name){
        return "\"" + name + "\"";
    }

}

