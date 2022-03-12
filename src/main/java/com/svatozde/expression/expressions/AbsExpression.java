package com.svatozde.expression.expressions;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

import static java.lang.Math.abs;

@SuperBuilder
@ToString
public class AbsExpression extends UnaryExpression {

    @Override
    public double evaluate() {
        return abs(content.evaluate());
    }

}
