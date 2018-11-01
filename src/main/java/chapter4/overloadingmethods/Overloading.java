package chapter4.overloadingmethods;

public class Overloading {
    public void fly(int numMiles) { }
//    public int fly(int numMiles) { return 1;} DOES NOT COMPILE
//    public static void fly(int numMiles) { } DOES NOT COMPILE fly(int) is already defined
    public void fly(short numFeet) { }
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) { }
    public void fly(short numFeet, int numMiles) throws Exception { }

    public void fly(int[] lengths) { }
//    public void fly(int... lengths) { } // DOES NOT COMPILE
}
