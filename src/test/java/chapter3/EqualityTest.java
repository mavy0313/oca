package chapter3;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EqualityTest {

    @Test
    public void stringBuilder() {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");

        assertFalse(one == two);
        assertTrue(one == three);
    }

    @Test
    public void stringLiteralsArePooled() {
        String x = "Hello World";
        String y = "Hello World";

        assertTrue(x == y);
    }

    @Test
    public void differentStringLiterals() {
        String x = "Hello World";
        String y = " Hello World".trim();

        assertFalse(x == y);
    }

    @Test
    public void newString() {
        String x = new String("Hello World");
        String y = "Hello World";

        assertFalse(x == y);
    }

    @Test
    public void stringLogicalEquality() {
        String x = "Hello World";
        String y = " Hello World".trim();

        assertTrue(x.equals(y));
    }

    class Tiger {
        String name;
    }

    @Test
    public void ifEqualsMethodIsNotImplementedReferenceEqualityIsChecked() {
        Tiger t1 = new Tiger();
        Tiger t2 = new Tiger();
        Tiger t3  = t1;

        assertTrue(t1 == t1);
        assertFalse(t1 == t2);
        assertFalse(t1.equals(t2));
    }
}
