package chapter6.callingmethodsthatthrowexceptions;

public class Bunny {
//    public static void main(String[] args) {
//        eatCarrot(); DOES NOT COMPILE
//    }

    public static void main(String[] args) throws NoMoreCarrotsExceptions {
        eatCarrot();
    }

    public static void main2(String[] args) {
        try {
            eatCarrot();
        } catch (NoMoreCarrotsExceptions e) {
            System.out.println("Sad rabbit");
        }
    }

    private static void eatCarrot() throws NoMoreCarrotsExceptions {

    }
}
