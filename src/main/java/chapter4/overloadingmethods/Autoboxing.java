package chapter4.overloadingmethods;

public class Autoboxing {
    public void fly(Integer numMiles) { }
    public void fly(int numMiles) { }

    public static void main(String[] args) {
        Autoboxing autoboxing = new Autoboxing();
        autoboxing.fly(3); //fly(int numMiles) will be called
    }
}
