package com.svatozde.expression.expressions;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.Map;

@SuperBuilder
@AllArgsConstructor
@ToString
public abstract class BinaryExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public Expression bind(Map<String, Double> values) {
        left.bind(values);
        right.bind(values);
        return this;
    }

}
