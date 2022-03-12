package com.svatozde.expression.expressions;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.Map;

@SuperBuilder
@AllArgsConstructor
@ToString
public abstract class UnaryExpression extends Expression {
    protected Expression content;

    @Override
    public Expression bind(Map<String, Double> values) {
        content.bind(values);
        return this;
    }
}
