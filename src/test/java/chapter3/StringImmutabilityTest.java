package chapter3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringImmutabilityTest {

    @Test
    public void immutability() {
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");

        assertEquals("12", s2);
    }
}
