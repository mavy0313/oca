package chapter4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VarargsTest {

    public void walk1(int... nums) {}
    public void walk2(int start, int... nums) {}
//    public void walk3(int... nums, int start)
//    public void walk4(int... start, int... nums) {}

    public int walk(int start, int... nums) {
        return nums.length;
    }

    @Test(expected = NullPointerException.class)
    public void main() {
        assertEquals(0, walk(1));
        assertEquals(1, walk(1, 2));
        assertEquals(2, walk(1, 2, 3));
        assertEquals(2, walk(1, new int[] {4, 5}));
        walk(1, null); // throws NPE null.length
    }
}
