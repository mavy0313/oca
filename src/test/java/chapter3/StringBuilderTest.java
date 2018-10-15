package chapter3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringBuilderTest {

    @Test
    public void twoStringBuilderVariablesReferToOneObject() {
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");

        assertEquals("abcdefg", a.toString());
        assertEquals("abcdefg", b.toString());
    }

    @Test
    public void stringBuilderLengthAndCapacity() {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animal");
        StringBuilder sb3 = new StringBuilder(10);

        assertEquals(0, sb1.length());
        assertEquals(16, sb1.capacity());

        assertEquals(6, sb2.length());
        assertEquals(22, sb2.capacity());

        assertEquals(0, sb3.length());
        assertEquals(10, sb3.capacity());
    }

    @Test
    public void charAtIndexOfLengthSubstring() {
        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);

        assertEquals("anim", sub);
        assertEquals(7, len);
        assertEquals('s', ch);
    }

    @Test
    public void append() {
        StringBuilder sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);

        assertEquals("1c-true", sb.toString());
    }

    @Test
    public void insert() {
        StringBuilder sb = new StringBuilder("animals");
        sb.insert(7, "-");
        sb.insert(0, "-");
        sb.insert(4, "-");

        assertEquals("-ani-mals-", sb.toString());
    }

    @Test
    public void deleteAndDeleteCharAt() {
        StringBuilder sb = new StringBuilder("abcdef");
        sb.delete(1, 3);
        sb.deleteCharAt(0);

        assertEquals("def", sb.toString());
    }

    @Test
    public void reverse() {
        StringBuilder sb = new StringBuilder("ABC");

        assertEquals("CBA", sb.reverse().toString());
    }
}
