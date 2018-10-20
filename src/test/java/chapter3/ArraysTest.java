package chapter3;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
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

    @Test
    public void accessingArray() {
        String [] mammals = {"monkey", "chimp", "donkey"};

        assertEquals(3, mammals.length);
        assertEquals("monkey", mammals[0]);
        assertEquals("chimp", mammals[1]);
        assertEquals("donkey", mammals[2]);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void throwArrayIndexOutOfBounds() {
        int[] numbers = new int[10];
//        numbers[10] = 3;
        numbers[numbers.length] = 5;
    }

    @Test
    public void sortingInts() {
        int[] numbers = {6, 9, 1};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }

        assertEquals(1, numbers[0]);
        assertEquals(6, numbers[1]);
        assertEquals(9, numbers[2]);
    }

    @Test
    public void sortingStrings() {
        String[] strings = {"10", "9", "100", "a", "A"};
        Arrays.sort(strings);
        for (String string : strings) {
            System.out.println(string + " ");
        }

        assertEquals("10", strings[0]);
        assertEquals("100", strings[1]);
        assertEquals("9", strings[2]);
        assertEquals("A", strings[3]);
        assertEquals("a", strings[4]);
    }

    @Test
    public void multiDimensionalArrayPrint() {
        int[][] twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] inner : twoD) {
            for (int num : inner) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void multiDimensionalArray() {
        int[][] twoD = {{1, 2}, {3, 4}, {5, 6}};

        assertEquals(1, twoD[0][0]);
        assertEquals(2, twoD[0][1]);
        assertEquals(3, twoD[1][0]);
        assertEquals(4, twoD[1][1]);
        assertEquals(5, twoD[2][0]);
        assertEquals(6, twoD[2][1]);
    }
}
