// Generated from /Users/home/Documents/flowChartAST/FCMGrammar.g4 by ANTLR 4.9.1
package com.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FCMGrammarParser}.
 */
public interface FCMGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FCMGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FCMGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCMGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FCMGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCMGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(FCMGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCMGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(FCMGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCMGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(FCMGrammarParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCMGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(FCMGrammarParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCMGrammarParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(FCMGrammarParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCMGrammarParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(FCMGrammarParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCMGrammarParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(FCMGrammarParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCMGrammarParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(FCMGrammarParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCMGrammarParser#elseifBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseifBlock(FCMGrammarParser.ElseifBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCMGrammarParser#elseifBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseifBlock(FCMGrammarParser.ElseifBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCMGrammarParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(FCMGrammarParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCMGrammarParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(FCMGrammarParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCMGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(FCMGrammarParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCMGrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(FCMGrammarParser.LineContext ctx);
}