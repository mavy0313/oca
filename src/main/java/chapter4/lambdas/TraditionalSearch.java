package chapter4.lambdas;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

//        print(animals, new CheckIfHopper());
        print(animals, a -> a.canHop());
        print(animals, Animal::canHop);
        print(animals, a -> a.canSwim());
        print(animals, Animal::canSwim);
        print(animals, a -> !a.canSwim());
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) {
                System.out.println(animal + " ");
            }
            System.out.println();
        }
    }
//    Valid lambdas
//    3: print(() -> true); // 0 parameters
//    4: print(a -> a.startsWith("test")); // 1 parameter
//    5: print((String a) -> a.startsWith("test")); // 1 parameter
//    6: print((a, b) -> a.startsWith("test")); // 2 parameters
//    7: print((String a, String b) -> a.startsWith("test")); // 2 parameters

//    Invalid lambdas
//    print(a, b -> a.startsWith("test")); // DOES NOT COMPILE - The first line needs parentheses around
//      the parameter list. Remember that the parentheses are only optional when there is one parameter
//      and it doesn’t have a type declared.
//    print(a -> { a.startsWith("test"); }); // DOES NOT COMPILE - return missed
//    print(a -> { return a.startsWith("test") }); // DOES NOT COMPILE - ; missed

//    (a, b) -> { int a = 0; return 5;} // DOES NOT COMPILE - Java doesn’t allow us to redeclare a local variable
}
