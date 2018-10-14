package chapter3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringMethodsTest {

    private String string = "animals";

    @Test
    public void length() {
        assertEquals(7, string.length());
    }

    @Test
    public void charAt() {
        assertEquals('a', string.charAt(0));
        assertEquals('s', string.charAt(6));
    }

    @Test
    public void indexOf() {
        assertEquals(0, string.indexOf('a'));
        assertEquals(4, string.indexOf("al"));
        assertEquals(4, string.indexOf('a', 4));
        assertEquals(-1, string.indexOf("al", 5));
    }

    @Test
    public void substring() {
        assertEquals("mals", string.substring(3));
        assertEquals("mals", string.substring(string.indexOf('m')));
        assertEquals("m", string.substring(3, 4));
        assertEquals("mals", string.substring(3, 7));
        assertEquals("", string.substring(3, 3));
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void substringEndIndexIsLessThenBeginIndex() {
        string.substring(3, 2);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void substringEndIndexIsGreaterThenStringLength() {
        string.substring(3, 8);
    }

    @Test
    public void toUpperCase() {
        assertEquals("ANIMALS", string.toUpperCase());
    }

    @Test
    public void toLowerCase() {
        assertEquals("abc123", "Abc123".toLowerCase());
    }

    @Test
    public void equals() {
        assertFalse("abc".equals("ABC"));
        assertTrue("ABC".equals("ABC"));
    }

    @Test
    public void equalsIgnoreCase() {
        assertTrue("abc".equalsIgnoreCase("ABC"));
    }

    @Test
    public void startsWith() {
        assertTrue("abc".startsWith("a"));
        assertFalse("abc".startsWith("A"));
    }

    @Test
    public void endsWith() {
        assertTrue("abc".endsWith("c"));
        assertFalse("abc".endsWith("a"));
    }

    @Test
    public void contains() {
        assertTrue("abc".contains("a"));
        assertFalse("abc".contains("B"));
    }

    @Test
    public void replace() {
        assertEquals("AbcAbc", "abcabc".replace('a', 'A'));
        assertEquals("AbcAbc", "abcabc".replace("a", "A"));
        assertEquals("ABcABc", "abcabc".replace("ab", "AB"));
    }

    @Test
    public void trim() {
        assertEquals("abc", "abc".trim());
        assertEquals("a b c", "\t   a b c\n".trim());
    }

    @Test
    public void methodChaining() {
        String start = "AniMal   ";
        String trimmed = start.trim();
        String lowerCase = trimmed.toLowerCase();
        String result = lowerCase.replace('a', 'A');

        assertEquals("AnimAl", result);
    }

    @Test
    public void methodChainingAndImmutability() {
        String a = "abc";
        String b = a.toUpperCase();
        b = b.replace("B", "2").replace('C', '3');

        assertEquals("abc", a);
        assertEquals("A23", b);
    }
}
