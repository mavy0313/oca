package chapter5.abstractclasses.definingabstractclass;

public abstract class Animal {
    protected int age;
    public void eat() {
        System.out.println("Animal is eating");
    }

    public abstract String getName();
}
