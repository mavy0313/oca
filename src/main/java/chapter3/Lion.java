package chapter3;

import java.util.ArrayList;
import java.util.List;

public class Lion {

    public void roar(String roar1, StringBuilder roar2) {
        roar1.concat("!!!");
        roar2.append("!!!");
    }

    public static void main(String[] args) {
        String roar1 = "roar";
        StringBuilder roar2 = new StringBuilder("roar");
        new Lion().roar(roar1, roar2);
        System.out.println(roar1 + " " + roar2);

//        Question 11
        int total = 0;
        StringBuilder letters = new StringBuilder("abcdefg");
        total += letters.substring(1, 2).length();
        total += letters.substring(6, 6).length();
//        total += letters.substring(6, 5).length(); //StringIndexOutOfBoundsException
        System.out.println(total);

        StringBuilder sb = new StringBuilder("abc");
        sb.substring(1);
        System.out.println(sb);

//        StringBuilder b = "rumble";
        StringBuilder b = new StringBuilder("rumble");
        b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
        System.out.println(b);

        int[][] scores = new int[5][];
        Object[][][] cubbies = new Object[3][0][5];
//        String beans[] = new beans[6];
        java.util.Date[] dates[] = new java.util.Date[2][];
//        int[][] types = new int[];
//        int[][] java = new int[][];
        int[] test = new int[] {};

        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.capacity());
        sb2.length();

        "".length();

        ArrayList list = new ArrayList();
        list.size();
//        list.capacity();

        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        ages.add(null);
        for (int age : ages) System.out.print(age); // NPE when null.toInt()
//        for (Integer age : ages) System.out.print(age); - no NPE



    }

}
