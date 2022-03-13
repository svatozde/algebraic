// Generated from Polynomial.g4 by ANTLR 4.9.3
package com.svatozde.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PolynomialParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PolynomialVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(PolynomialParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusminus}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusminus(PolynomialParser.PlusminusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code abs}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbs(PolynomialParser.AbsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prod}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProd(PolynomialParser.ProdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code len}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLen(PolynomialParser.LenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(PolynomialParser.ConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(PolynomialParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExp}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExp(PolynomialParser.ParenExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code power}
	 * labeled alternative in {@link PolynomialParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(PolynomialParser.PowerContext ctx);
}