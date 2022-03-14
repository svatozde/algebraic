package com.svatozde.expression.expressions;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString
public class ParenthesisExpression extends UnaryExpression {
    @Override
    public double evaluate() {
        return content.evaluate();
    }

}
