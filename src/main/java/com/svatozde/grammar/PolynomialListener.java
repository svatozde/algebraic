// Generated from Polynomial.g4 by ANTLR 4.9.3
package com.svatozde.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PolynomialParser}.
 */
public interface PolynomialListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDiv(PolynomialParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDiv(PolynomialParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusminus}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusminus(PolynomialParser.PlusminusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusminus}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusminus(PolynomialParser.PlusminusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negative}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegative(PolynomialParser.NegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negative}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegative(PolynomialParser.NegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code abs}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAbs(PolynomialParser.AbsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code abs}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAbs(PolynomialParser.AbsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prod}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterProd(PolynomialParser.ProdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prod}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitProd(PolynomialParser.ProdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code len}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLen(PolynomialParser.LenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code len}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLen(PolynomialParser.LenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConst(PolynomialParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConst(PolynomialParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVar(PolynomialParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVar(PolynomialParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExp}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExp(PolynomialParser.ParenExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExp}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExp(PolynomialParser.ParenExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code power}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPower(PolynomialParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code power}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPower(PolynomialParser.PowerContext ctx);
}