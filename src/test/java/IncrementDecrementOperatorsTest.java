import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IncrementDecrementOperatorsTest {

    @Test
    public void preIncrement() {
        int count = 0;
        assertEquals(1, ++count);
    }

    @Test
    public void preIncrementInExpression() {
        int operand1 = 0;
        int operand2 = 1;

        assertEquals(2, operand1 + ++operand2);
    }

    @Test
    public void postIncrement() {
        int count = 0;
        assertEquals(0, count++);
        assertEquals(1, count);
    }

    @Test
    public void postIncrementInExpression() {
        int operand1 = 0;
        int operand2 = 1;

        assertEquals(1, operand1 + operand2++);
    }
}
