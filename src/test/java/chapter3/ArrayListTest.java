package chapter3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayListTest {

    @Test
    public void add() {
        ArrayList list = new ArrayList();
        list.add("hawk");
        list.add(Boolean.TRUE);

        assertEquals("hawk", list.get(0));
        assertTrue((Boolean) list.get(1));
    }

    @Test
    public void addWithGenericsAndIndex() {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add(1, "robin"); //hawk, robin
        birds.add(0, "blue jay"); //blue jay, hawk, robin
        birds.add(1, "cardinal"); //blue jay, cardinal, hawk, robin

        assertEquals("blue jay", birds.get(0));
        assertEquals("cardinal", birds.get(1));
        assertEquals("hawk", birds.get(2));
        assertEquals("robin", birds.get(3));
    }

    @Test
    public void remove() {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");

        assertFalse(birds.remove("cardinal"));
        assertTrue(birds.remove("hawk"));
        assertEquals("hawk", birds.remove(0));
        assertEquals(0, birds.size());
    }

    @Test
    public void set() {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");

        assertEquals(1, birds.size());
        assertEquals("hawk", birds.set(0, "robin"));
        assertEquals(1, birds.size());
        assertEquals("robin", birds.get(0));
//        birds.set(1, "robin"); IndexoutOfBoundsException
    }

    @Test
    public void isEmptySize() {
        List<String> birds = new ArrayList<>();

        assertTrue(birds.isEmpty());
        assertEquals(0, birds.size());

        birds.add("hawk");
        birds.add("hawk");
        assertFalse(birds.isEmpty());
        assertEquals(2, birds.size());
    }

    @Test
    public void clear() {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");

        assertFalse(birds.isEmpty());
        assertEquals(2, birds.size());

        birds.clear();

        assertTrue(birds.isEmpty());
        assertEquals(0, birds.size());
    }

    @Test
    public void contains() {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");

        assertTrue(birds.contains("hawk"));
        assertFalse(birds.contains("robin"));
    }

    @Test
    public void equals() {
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();

        assertEquals(one, two);

        one.add("a");

        assertNotEquals(one, two);

        two.add("a");
        assertEquals(one, two);

        one.add("b"); //a, b
        two.add(0, "b"); //b, a

        assertNotEquals(one, two);
    }
}
