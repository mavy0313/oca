package chapter4.constructors;

public class Hamster {
    private String color;
    private int weight;
    public Hamster(int weight) { // first constructor
        this.weight = weight;
        color = "brown";
    }
    public Hamster(int weight, String color) { // second constructor
        this.weight = weight;
        this.color = color;
    }

//    public Hamster(int weight) {
//        Hamster(weight, "brown"); // DOES NOT COMPILE
//    }

//    public Hamster(int weight) {
//        new Hamster(weight, "brown"); // Compiles but does not do what we want
//    }

//    public Hamster(int weight) {
//        this(weight, "brown");
//    }

//    public Hamster(int weight) {
//        System.out.println("in constructor");
//        // ready to call this
//        this(weight, "brown"); // DOES NOT COMPILE this() must be first statement in constructor
//    }
}
