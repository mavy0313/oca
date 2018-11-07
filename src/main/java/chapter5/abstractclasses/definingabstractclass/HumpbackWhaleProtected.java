package chapter5.abstractclasses.definingabstractclass;

public class HumpbackWhaleProtected extends WhaleProtected {
//    private void sing() { DOES NOT COMPILE due to private
//        System.out.println("Humpback whale is singing");
//    }

    @Override
    protected void sing() {
        System.out.println("Humpback whale is singing");
    }
}
