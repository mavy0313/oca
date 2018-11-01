package chapter4.overloadingmethods;

public class Varargs {
//    public void fly(int[] lengths) { }
    public void fly(int... lengths) { }

    public static void main(String[] args) {
        Varargs varargs = new Varargs();
        varargs.fly(1, 2, 3);
//        varargs.fly(new int[]{1, 2, 3});
    }
}
