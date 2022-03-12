package com.svatozde.expression.expressions;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString
public class MinusExpression extends BinaryExpression {
    @Override
    public double evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
