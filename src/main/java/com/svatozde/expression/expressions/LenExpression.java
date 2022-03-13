package com.svatozde.expression.expressions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@Builder
@AllArgsConstructor
@ToString
public class LenExpression extends Expression {
    private String string;

    @Override
    public double evaluate() {
        return string.length();
    }
}
