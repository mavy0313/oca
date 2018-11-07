package chapter5.interfaces.abstractmethodsandmultipleinheritance;

public class BearOverload implements HerbivoreOverload, OmnivoreOverload {
    public int eatPlants(int quantity) {
        System.out.println("Eating plants: "+quantity);
        return quantity;
    }
    public void eatPlants() {
        System.out.println("Eating plants");
    }
}
