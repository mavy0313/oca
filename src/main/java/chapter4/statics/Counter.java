package chapter4.statics;

public class Counter {
    private static int count;

    public Counter() {
        count++;
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        System.out.println(count);
    }
}
