package chapter5;

public class Lion extends AnimalWithoutConstructor {
    private void roar() {
        System.out.println("The " + getAge() + " year old lion says: Roar!");
//        System.out.println("The " + age + " year old lion says: Roar!"); DOESN'T COMPILE
    }
}
