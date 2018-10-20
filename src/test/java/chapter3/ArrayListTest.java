package chapter3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

    @Test
    public void autoboxing() {
        List<Double> weights = new ArrayList<>();
        weights.add(50.5);
        weights.add(new Double(60));
        weights.remove(50.5);
        double first = weights.get(0);

        assertEquals(60, first, 0);
    }

    @Test(expected = NullPointerException.class)
    public void autoboxingNpe() throws Exception {
        List<Integer> heights = new ArrayList<>();
        heights.add(null);
        int h = heights.get(0);// null.intValue() throws NPE
    }

    @Test
    public void autoboxingIntoInteger() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(1);

        assertEquals(new Integer(1), numbers.get(0));
    }

    @Test
    public void convertListToArray() {
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();

        assertEquals(2, objectArray.length);

        String[] stringArray = list.toArray(new String[0]);

        assertEquals(2, stringArray.length);
        assertEquals("hawk", stringArray[0]);
        assertEquals("robin", stringArray[1]);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void convertArrayToList() {
        String[] array = {"hawk", "robin"};
//        The original array and created array backed List are linked. When a change is made to one,
//        it is available in the other. It is a fixed-size list and is also known a backed List
//        because the array changes with it.
        List<String> list = Arrays.asList(array);

        assertEquals(2, list.size());

        list.set(1, "test");
        array[0] = "new";

        assertEquals("new", list.get(0));
        assertEquals("test", list.get(1));
        assertEquals("new", array[0]);
        assertEquals("test", array[1]);

        list.remove(1); //throws UnsupportedOperationException
    }

    @Test
    public void sorting() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        Collections.sort(numbers);

        assertEquals(5, numbers.get(0).intValue());
        assertEquals(81, numbers.get(1).intValue());
        assertEquals(99, numbers.get(2).intValue());
    }
}
