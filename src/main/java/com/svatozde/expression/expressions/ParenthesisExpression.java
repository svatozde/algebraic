package com.svatozde.expression.expressions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

import java.util.Map;

@Builder
@AllArgsConstructor
@ToString
public class ParenthesisExpression extends Expression {
    private Expression content;

    @Override
    public double evaluate() {
        return content.evaluate();
    }

    @Override
    public Expression bind(Map<String, Double> values) {
        content.bind(values);
        return this;
    }


}
