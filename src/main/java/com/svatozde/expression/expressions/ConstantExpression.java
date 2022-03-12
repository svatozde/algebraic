package com.svatozde.expression.expressions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@Builder
@AllArgsConstructor
@ToString
public class ConstantExpression extends Expression {
    private double value;

    @Override
    public double evaluate() {
        return value;
    }
}
