package chapter4.overloadingmethods;

public class ReferenceTypes {
    public void fly(String s) {
        System.out.print("string ");
    }
    public void fly(Object o) {
        System.out.print("object ");
    }

    public static void main(String[] args) {
        ReferenceTypes referenceTypes = new ReferenceTypes();
        referenceTypes.fly("test");
        referenceTypes.fly(56);
    }
}
