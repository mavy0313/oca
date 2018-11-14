package chapter6.usingtry;

public class ZooWithInheritedExceptions {
    public void visitMonkeys() {
        try {
            seeAnimal();
        } catch (ExhibitClosedForLunch e) { //subclass exception
            System.out.println("ExhibitClosedForLunch");
        } catch (ExhibitClosed e) { //superclass exception
            System.out.println("ExhibitClosed");
        }
    }

    public static void main(String[] args) {
        ZooWithInheritedExceptions zoo = new ZooWithInheritedExceptions();
        zoo.visitMonkeys();
    }

    private void seeAnimal() {
        System.out.println("seeAnimal");
//        throw new ExhibitClosedForLunch();
//        throw new ExhibitClosed();
    }
}
