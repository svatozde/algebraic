package com.svatozde.expression.parser;


import com.svatozde.expression.expressions.*;
import com.svatozde.grammar.PolynomialBaseVisitor;
import com.svatozde.grammar.PolynomialParser;

public class AlgebraVisitor extends PolynomialBaseVisitor<Expression> {
    @Override
    public Expression visitVar(PolynomialParser.VarContext ctx) {
        Expression ex = VariableExpression.builder()
            .variable(ctx.VAR().getText())
            .build();
        return ctx.MINUS() == null ? ex : negative(ex);
    }

    @Override
    public Expression visitConst(PolynomialParser.ConstContext ctx) {
        double value = Double.parseDouble(ctx.NUM().getText());
        Expression ex = ConstantExpression.builder()
            .value(value)
            .build();
        return ctx.MINUS() == null ? ex : negative(ex);
    }

    private Expression negative(Expression expression) {
        return NegativeExpression.builder().content(expression).build();
    }

    @Override
    public Expression visitParenExp(PolynomialParser.ParenExpContext ctx) {
        Expression ex = ParenthesisExpression.builder()
            .content(visit(ctx.expr()))
            .build();

        return ctx.MINUS() == null ? ex : negative(ex);
    }

    @Override
    public Expression visitAbs(PolynomialParser.AbsContext ctx) {
        return AbsExpression.builder()
            .content(visit(ctx.expr()))
            .build();
    }

    @Override
    public Expression visitPower(PolynomialParser.PowerContext ctx) {
        return PowerExpression.builder()
            .left(visit(ctx.left))
            .right(visit(ctx.right))
            .build();
    }

    @Override
    public Expression visitDiv(PolynomialParser.DivContext ctx) {
        return DivisionExpression.builder()
            .left(visit(ctx.left))
            .right(visit(ctx.right))
            .build();
    }

    @Override
    public Expression visitProd(PolynomialParser.ProdContext ctx) {
        return MultiplicationExpression.builder()
            .left(visit(ctx.left))
            .right(visit(ctx.right))
            .build();
    }

    @Override
    public Expression visitPlusminus(PolynomialParser.PlusminusContext ctx) {
        if (ctx.PLUS() != null) {
            return PlusExpression.builder()
                .left(visit(ctx.left))
                .right(visit(ctx.right))
                .build();
        }

        if (ctx.MINUS() != null) {
            return MinusExpression.builder()
                .left(visit(ctx.left))
                .right(visit(ctx.right))
                .build();
        }
        throw new IllegalStateException();
    }
}
