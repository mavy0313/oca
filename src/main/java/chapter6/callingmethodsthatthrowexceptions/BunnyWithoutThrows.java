package chapter6.callingmethodsthatthrowexceptions;

public class BunnyWithoutThrows {

    public void bad() {
//        try {
//            eatCarrot();
//        } catch (NoMoreCarrotsExceptions e) { //DOES NOT COMPILE
//            System.out.println("Sad rabbit");
//        }
    }

    public void good() throws NoMoreCarrotsExceptions {
        eatCarrot();
    }

    private static void eatCarrot() {

    }
}
