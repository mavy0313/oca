package chapter5.interfaces.staticinterfacemethods;

public class Bunny implements Hop {
    public void printDetails() {
//        System.out.println(getJumpHeight()); // DOES NOT COMPILE
        System.out.println(Hop.getJumpHeight()); // DOES NOT COMPILE
    }
}
