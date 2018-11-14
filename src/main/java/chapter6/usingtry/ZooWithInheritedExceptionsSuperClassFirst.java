package chapter6.usingtry;

public class ZooWithInheritedExceptionsSuperClassFirst {
    public void visitMonkeys() {
        try {
            seeAnimal();
        } catch (ExhibitClosed e) { //superclass exception
            System.out.println("ExhibitClosedForLunch");
        } //catch (ExhibitClosedForLunch e) { //subclass exception DOES NOT COMPILE
//            System.out.println("ExhibitClosed");
//        }
    }

    public void visitSnakes() {
        try {
            seeAnimal();
        } catch (RuntimeException e) {
            System.out.print("runtime exception");
//        } catch (ExhibitClosed e) {// DOES NOT COMPILE
//            System.out.print("not today");
        } catch (Exception e) {
            System.out.print("exception");
        }
    }

    public static void main(String[] args) {
        ZooWithInheritedExceptionsSuperClassFirst zoo = new ZooWithInheritedExceptionsSuperClassFirst();
        zoo.visitMonkeys();
    }

    private void seeAnimal() {
        System.out.println("seeAnimal");
//        throw new ExhibitClosedForLunch();
//        throw new ExhibitClosed();
    }
}
