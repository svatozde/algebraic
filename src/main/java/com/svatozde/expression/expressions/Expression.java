package com.svatozde.expression.expressions;

import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Map;

@SuperBuilder
@AllArgsConstructor
public abstract class Expression {
    public abstract double evaluate();
    
    public Expression bind(Map<String, Double> values) {
        return this;
    }
}
