package chapter4;

public class OptionalSpecifiersTest {

    public void walk1() {}
    public final void walk2() {}
    public static final void walk3() {}
    public final static void walk4() {}
//    public modifier void walk5() {}  DOES NOT COMPILE
//    public void final walk6() {} DOES NOT COMPILE
    final public void walk7() {}
}
