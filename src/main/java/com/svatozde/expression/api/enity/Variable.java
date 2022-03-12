package com.svatozde.expression.api.enity;

import lombok.*;

@Builder
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Variable {
    private String name;
    private double value;
}
