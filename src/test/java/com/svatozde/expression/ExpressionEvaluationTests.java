package com.svatozde.expression;

import com.google.common.collect.ImmutableMap;
import com.svatozde.expression.expressions.Expression;
import com.svatozde.expression.parser.Parser;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class ExpressionEvaluationTests {

    @Test
    void testPlus() {
        assertEquals(4, eval("1+3"));
    }

    @Test
    void testMult() {
        assertEquals(3, eval("1*3"));
    }

    @Test
    void testAssoc() {
        assertEquals(13, eval("1+3*4"));
    }

    @Test
    void testAssoc2() {
        assertEquals(7, eval("1*3+4"));
    }

    @Test
    void testAssoc3() {
        assertEquals(1, eval("1/3 + 2/3"));
    }

    @Test
    void testDivision() {
        assertEquals(14, eval("4/2+3*4"));
    }

    @Test
    void testParenthesis() {
        assertEquals(4, eval("5/(2+3)*4"));
    }

    @Test
    void testPower() {
        assertEquals(10, eval("2^(1+2)+2"));
    }

    @Test
    void testParenthesis2() {
        assertEquals(12, eval("3*5/(2+3)*4"));
    }

    @Test
    void testParenthesis3() {
        assertEquals(3, eval("(3*5)/(2+3)"));
    }

    @Test
    void testNegative() {
        assertEquals(-4, eval("-5+1"));
    }

    @Test
    void testNegativeVariable() {
        String expression = "-a+5";
        Expression ex = Parser.parse(expression);
        Map<String, Double> vars = ImmutableMap.<String, Double>builder()
            .put("a", 5D)
            .build();
        double res = ex.bind(vars).evaluate();
        assertEquals(0, res);
    }

    @Test
    void testNegativePover() {
        assertEquals(0.25, eval("4^-1"));
    }

    @Test
    void testAbs() {
        assertEquals(2, eval("ABS(3-5)"));
    }

    @Test
    void testNeativeMultiplication() {
        assertEquals(15, eval("ABS(-3*-5)"));
    }

    @Test
    void testBind() {
        String expression = "a+b";
        Expression ex = Parser.parse(expression);
        Map<String, Double> vars = ImmutableMap.<String, Double>builder()
            .put("a", 1D)
            .put("b", 2D)
            .build();
        double res = ex.bind(vars).evaluate();
        assertEquals(3, res);
    }

    @Test
    void testBindMissingVars() {
        String expression = "a+b";
        Expression ex = Parser.parse(expression);
        Map<String, Double> vars = ImmutableMap.<String, Double>builder()
            .put("a", 1D)
            .build();
        assertThrows(IllegalStateException.class, () -> ex.bind(vars));
    }

    @Test
    void testNotBinded() {
        String expression = "a+b";
        Expression ex = Parser.parse(expression);
        assertThrows(IllegalStateException.class, ex::evaluate);
    }

    @Test
    void testNotPowerToAbs() {
        assertEquals(4, eval("2^ABS(-2)"));
    }

    @Test
    void testNotPowerToAbs2() {
        assertEquals(4, eval("2^ABS(-1*-1+ABS(-1))"));
    }

    @Test
    void testNegativeParenthesis() {
        assertEquals(-4, eval("-(2+2)"));
    }

    @Test
    void testSquareRoot() {
        assertEquals(6, eval("36^ABS(1/2)"));
    }

    @Test
    void testStringLen() {
        assertEquals(6, eval("2+LEN('abcd')"));
    }

    @Test
    void testStringLenNegative() {
        assertEquals(-1, eval("-LEN('a')"));
    }

    @Test
    void testStringLenPow() {
        assertEquals(0.5, eval("2^-LEN('a')"));
    }

    @Test
    void testStringLenEmpty() {
        assertEquals(-1.0, eval("-5*-LEN('')-1"));
    }

    @Test
    void testCommut() {
        assertEquals(4, eval("2*2/2*2"));
    }

    @Test
    void testCommut2() {
        assertEquals(4, eval("(2*(2/2)*2)"));
    }

    @Test
    void testCommutBracket() {
        assertEquals(16, eval("2*(2+2)*2"));
    }


    private double eval(final String expression) {
        return Parser.parse(expression).evaluate();
    }
}
