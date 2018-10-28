package chapter4.statics;

import static java.util.Arrays.*; // DOES NOT COMPILE
import static java.util.Arrays.asList;
//static import java.util.Arrays.*; // DOES NOT COMPILE

public class BadStaticImports {
    public static void main(String[] args) {
//        Arrays.asList("one"); // DOES NOT COMPILE
//        asList("one");
//        asList()
    }
}
