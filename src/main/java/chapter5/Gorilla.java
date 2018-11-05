package chapter5;

public class Gorilla extends AnimalWithTwoConstructors {
    public Gorilla(int age) {
        super(age, "Gorilla");
    }

    public Gorilla() {
        super(5);
    }
}
