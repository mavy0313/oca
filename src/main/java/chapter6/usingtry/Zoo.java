package chapter6.usingtry;

public class Zoo {
    void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            getUp();
        }
        seeAnimals();
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.explore();
    }

    private void seeAnimals() {
        System.out.println("seeAnimals()");
    }

    private void getUp() {
        System.out.println("getUp()");
    }

    void fall() {
        throw new RuntimeException();
    }

}
