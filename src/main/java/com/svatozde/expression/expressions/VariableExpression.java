package com.svatozde.expression.expressions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

import java.util.Map;
import java.util.Optional;

@Builder
@AllArgsConstructor
@ToString
public class VariableExpression extends Expression {
    private Double value;
    private String variable;

    @Override
    public double evaluate() {
        return Optional.ofNullable(value)
            .orElseThrow(() -> new IllegalStateException("Variable: " + variable + " has no value!"));
    }

    @Override
    public Expression bind(Map<String, Double> values) {
        value = Optional.ofNullable(values.get(variable))
            .orElseThrow(() -> new IllegalStateException("Variable: " + variable + " has no value!"));
        return this;
    }
}
