package chapter5.interfaces.defaultmethods;

public class Cat implements Walk, Run { // NOT COMPILED without getSpeed implementation
    public int getSpeed() {
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
    }
}
