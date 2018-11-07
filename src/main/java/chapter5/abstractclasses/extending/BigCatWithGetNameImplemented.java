package chapter5.abstractclasses.extending;

public abstract class BigCatWithGetNameImplemented extends Animal {
    public String getName() {
        return "BigCat";
    }
    public abstract void roar();
}
