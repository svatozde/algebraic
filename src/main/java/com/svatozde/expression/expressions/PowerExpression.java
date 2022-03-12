package com.svatozde.expression.expressions;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

import static java.lang.Math.pow;

@SuperBuilder
@ToString
public class PowerExpression extends BinaryExpression {
    @Override
    public double evaluate() {
        return pow(left.evaluate(), right.evaluate());
    }
}
