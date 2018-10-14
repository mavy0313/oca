package chapter3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

//        1. If both operands are numeric, + means numeric addition.
//        2. If either operand is a String, + means concatenation.
//        3. The expression is evaluated left to right.

public class ConcatenationTest {

    @Test
    public void bothNumeric() {
        assertEquals(3, 1 + 2);
    }

    @Test
    public void bothStrings() {
        assertEquals("ab", "a" + "b");
    }

    @Test
    public void twoStringsOneNumeric() {
        assertEquals("ab3", "a" + "b" + 3);
    }

    @Test
    public void twoNumericOneString() {
        assertEquals("3c", 1 + 2 + "c");
    }

    @Test
    public void usingThreeRulesAndVariables() {
        int three = 3;
        String four = "4";
        assertEquals("64", 1 + 2 + three + four);
    }

    @Test
    public void shortOperator() {
        String s = "1";
        s += "2";
        s += 3;

        assertEquals("123", s);
    }


}
