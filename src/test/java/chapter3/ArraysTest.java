package chapter3;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class ArraysTest {

    @Test
    public void arrayTypeTest() {
        String [] bugs = {"cricket", "beetle", "ladybug"};
        String [] alias = bugs;

        System.out.println(bugs.toString());
        System.out.println(Arrays.toString(bugs));
        assertTrue(bugs.equals(alias)); //reference equality
    }

    @Test
    public void castingTest() {
        String [] strings = {"stringValue"};
        Object [] objects = strings;
        String [] againStrings = (String[]) objects;
//        againStrings[0] = new StringBuilder(); doesn't compile required String found StringBuilder
//        objects[0] = new StringBuilder(); throws java.lang.ArrayStoreException

        assertTrue(strings.equals(objects));
        assertTrue(strings.equals(againStrings));
//        assertTrue(((String) objects[0]).equals(strings[0]));
        assertTrue(objects[0].equals(strings[0]));
        assertTrue(objects[0].equals(againStrings[0]));
    }
}
