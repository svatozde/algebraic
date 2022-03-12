package com.svatozde.expression.parser;

import com.svatozde.expression.expressions.Expression;
import com.svatozde.grammar.PolynomialBaseVisitor;
import com.svatozde.grammar.PolynomialLexer;
import com.svatozde.grammar.PolynomialParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Parser {
    public static final Expression parse(final String expression) {
        PolynomialLexer lexer = new PolynomialLexer(CharStreams.fromString(expression));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PolynomialParser parser = new PolynomialParser(tokens);
        ParseTree tree = parser.expr();
        PolynomialBaseVisitor<Expression> visitor = new AlgebraVisitor();
        return visitor.visit(tree);
    }
}
