package chapter4.statics;

public class Static {

    private String name = "Static class";

    public static void first() {}
    public static void second() {}
    public void third() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        first();
        second();
//        third(); DOES NOT COMPILE instance method can not be called from static context

    }
}
