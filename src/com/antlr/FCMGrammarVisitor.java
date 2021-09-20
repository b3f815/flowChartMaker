// Generated from /Users/home/Documents/flowChartAST/FCMGrammar.g4 by ANTLR 4.9.1
package com.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FCMGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FCMGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FCMGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FCMGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCMGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(FCMGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCMGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(FCMGrammarParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCMGrammarParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(FCMGrammarParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCMGrammarParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(FCMGrammarParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCMGrammarParser#elseifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifBlock(FCMGrammarParser.ElseifBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCMGrammarParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(FCMGrammarParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCMGrammarParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(FCMGrammarParser.LineContext ctx);
}