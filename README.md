# FlowChartMaker -textToFlowChart
## Befin Babu


To achieve the goal of transforming textual instructions into a visual flowchart, a program was meticulously architected, leveraging the robustness of Java and the parsing capabilities of ANTLR to interpret and structure the instructions into an Abstract Syntax Tree (AST). The project's ambition was to facilitate users in visualising the flow of control and data through a set of instructions that resemble the C programming language, with familiar syntactical elements such as semicolons for statement termination and braces for defining blocks.

Here's a detailed outline of the development process:

Syntax Definition:
The project commenced with the design of a syntax for flowchart instructions. This syntax was inspired by the C programming language, adopting semicolons to denote the end of instructions and braces to enclose blocks of code. This design choice was made to ensure that users familiar with C-like languages could easily adapt to and understand the flowchart instructions.

Graph Construction:
To translate these instructions into a graph that represents the flowchart, it was imperative to dissect the instructions into identifiable entities, comprehend the scope and relationship of each instruction, and interpret the significance of keywords. To accomplish this, I constructed an AST, which served as a blueprint, outlining the hierarchical structure of the instructions and their relationships.

AST Generation with ANTLR:
ANTLR (Another Tool for Language Recognition) was employed to generate the AST. ANTLR is a powerful parser generator that can easily convert a list of instructions into a structured AST, representing the grammar and syntax of the instructions. Once the AST was refined, it became the foundation upon which the flowchart could be built.

Visualization with Graphviz:
With the AST in place, the next step involved traversing this tree and translating it into a visual graph. This was achieved using Graphviz, a Java-based graph visualization software. Graphviz provided the necessary tools to create nodes and edges that correspond to the entities and their connections within the flowchart.

The program includes features to support various flowchart components such as sequences, loops (while, for, do-while), and conditional statements (if-else). Each of these features is mapped to corresponding structures in the AST and then visually represented in the flowchart, ensuring that the final graph accurately reflects the logical flow of the instructions provided by the user.

Overall, the program stands as a testament to the power of combining language processing with visual data representation, ultimately bridging the gap between textual instructions and intuitive graphical flowcharts.
## Dependancies



- Graphviz should be installed and added to path.
    ```
    brew install graphviz
    ```


## Input Format

- The input format borrows lightly from the C syntax.
- The input support If,If_Else,While etc..

For Example :
```
int i=1;
int j=1;
if(i==1){
    j=2;
}
else{
    j=3;
}
print(i);
print(j);
```

![alt text](https://github.com/b3f815/flowChartMaker/blob/master/output/flow.png?raw=true)

Peace ✌️.
