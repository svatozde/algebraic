package com.svatozde.expression.api;

import com.svatozde.expression.api.enity.ExpressionPost;
import com.svatozde.expression.api.enity.ExpressionResponse;
import com.svatozde.expression.api.enity.Variable;
import com.svatozde.expression.parser.Parser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class Expression {
    @PostMapping("/evaluate")
    ExpressionResponse newEmployee(@RequestBody ExpressionPost expression) {

        Map<String, Double> variables = expression.getVariables().stream()
            .collect(Collectors.toUnmodifiableMap(Variable::getName, Variable::getValue));

        double result = Parser.parse(expression.getExpression())
            .bind(variables)
            .evaluate();
        return ExpressionResponse.builder().result(result).build();
    }

}
