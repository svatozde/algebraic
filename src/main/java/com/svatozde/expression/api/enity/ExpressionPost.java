package com.svatozde.expression.api.enity;

import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ExpressionPost {
    private String expression;
    private List<Variable> variables;
}
