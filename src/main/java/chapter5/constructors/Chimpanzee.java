package chapter5.constructors;

public class Chimpanzee extends Ape {
    public static void main(String[] args) {
        new Chimpanzee();
    }

//    Java compiler will automatically insert default no-arg constructor
//    public Chimpanzee() {
//        super();
//    }

//    output:
//    Primate
//    Ape
}
