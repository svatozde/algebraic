package com.svatozde.expression.parser;


import com.svatozde.expression.expressions.*;
import com.svatozde.grammar.PolynomialBaseVisitor;
import com.svatozde.grammar.PolynomialParser;

public class AlgebraVisitor extends PolynomialBaseVisitor<Expression> {
    @Override
    public Expression visitVar(PolynomialParser.VarContext ctx) {
        return VariableExpression.builder()
            .variable(ctx.VAR().getText())
            .build();
    }

    @Override
    public Expression visitNegative(PolynomialParser.NegativeContext ctx) {
        return NegativeExpression.builder()
            .content(visit(ctx.expr()))
            .build();
    }

    @Override
    public Expression visitConst(PolynomialParser.ConstContext ctx) {
        double value = Double.parseDouble(ctx.NUM().getText());
        return ConstantExpression.builder()
            .value(value)
            .build();
    }

    @Override
    public Expression visitParenExp(PolynomialParser.ParenExpContext ctx) {
        return ParenthesisExpression.builder()
            .content(visit(ctx.expr()))
            .build();
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
    public Expression visitLen(PolynomialParser.LenContext ctx) {
        String str = ctx.STR() != null ? ctx.STR().getText() : "";
        str = str.replace("'", ""); //TODO do this in grammar
        return LenExpression.builder()
            .string(str)
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
