package chapter6.usingtry;

public class ZooWithCustomExceptions {
    public void visitPorcupine() {
        try {
            seeAnimal();
        } catch (AnimalsOutForAWalk e) {
            System.out.println("try back later");
        } catch (ExhibitClosed e) {
            System.out.println("not today");
        }
    }

    public static void main(String[] args) {
        ZooWithCustomExceptions zoo = new ZooWithCustomExceptions();
        zoo.visitPorcupine();
    }

    private void seeAnimal() {
        System.out.println("seeAnimal()");
//        throw new AnimalsOutForAWalk();
//        throw new ExhibitClosed();
    }
}
