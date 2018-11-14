package chapter6.usingtry;

public class ZooWithFinally {
    void explore() {
        try {
            seeAnimals();
            fall();
        } catch (Exception e) {
            getHugFromDaddy();
        } finally {
            seeMoreAnimals();
        }
        goHome();
    }

    private void goHome() {
        System.out.println("goHome()");
    }

    private void seeMoreAnimals() {
        System.out.println("seeMoreAnimals()");
    }

    private void getHugFromDaddy() {
        System.out.println("getHugFromDaddy()");
    }

    public static void main(String[] args) {
        ZooWithFinally zoo = new ZooWithFinally();
        zoo.explore();
    }

    private void seeAnimals() {
        System.out.println("seeAnimals()");
    }

    void fall() {
        throw new RuntimeException();
    }

}
