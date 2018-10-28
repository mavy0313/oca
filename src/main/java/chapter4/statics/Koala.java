package chapter4.statics;

public class Koala {
    public static int count = 0;

    public static void main(String[] args) {
        System.out.println(count);

        Koala k = new Koala();
        System.out.println(k.count); //java checks that accessing static variable and uses Koala.count
        k = null;
        System.out.println(k.count); //no NPE

        Koala.count = 4;
        Koala koala1 = new Koala();
        Koala koala2 = new Koala();
        koala1.count = 6;
        koala2.count = 5;
        System.out.println(Koala.count); // 5
    }
}
