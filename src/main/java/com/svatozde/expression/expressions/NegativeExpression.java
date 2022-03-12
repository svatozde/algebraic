package com.svatozde.expression.expressions;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString
public class NegativeExpression extends UnaryExpression {
    @Override
    public double evaluate() {
        return -content.evaluate();
    }
}

