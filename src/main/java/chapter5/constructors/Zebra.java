package chapter5.constructors;

import chapter5.constructors.Animal;

public class Zebra extends Animal {
    public Zebra(int age) {
        super(age);
    }

    public Zebra() {
        this(4);
    }
}
