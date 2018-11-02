package chapter4.encapsulatingdata;

public class Mutable {
    private StringBuilder builder;

    public Mutable(StringBuilder b) {
        builder = new StringBuilder(b);
    }
    public StringBuilder getBuilder() {
        return new StringBuilder(builder);
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("initial");
        Mutable problem = new Mutable(sb);
        sb.append(" added");
        StringBuilder gotBuilder = problem.getBuilder();
        gotBuilder.append(" more");
        System.out.println(problem.getBuilder()); //initial
    }
}
