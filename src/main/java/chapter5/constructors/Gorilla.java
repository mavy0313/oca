package chapter5.constructors;

import chapter5.constructors.AnimalWithTwoConstructors;

public class Gorilla extends AnimalWithTwoConstructors {
    public Gorilla(int age) {
        super(age, "Gorilla");
    }

    public Gorilla() {
        super(5);
    }
}
