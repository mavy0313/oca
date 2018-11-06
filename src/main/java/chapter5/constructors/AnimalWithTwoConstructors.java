package chapter5.constructors;

public class AnimalWithTwoConstructors {
    private int age;
    private String name;

    public AnimalWithTwoConstructors(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public AnimalWithTwoConstructors(int age) {
        super();
        this.age = age;
        this.name = null;
    }
}
