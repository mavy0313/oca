import org.junit.Test;

public class NumericPromotionTest {

    @Test
    public void promoteToLargerValue() {
        int operand1 = 2;
        long operand2 = 3;
        long result = operand1 + operand2;
    }

    @Test
    public void promoteToFloatingPointValue() {
        int operand1 = 2;
        float operand2 = 3f;
        float result = operand1 + operand2;
    }

    @Test
    public void promoteSmallerThenIntToInt() {
        short operand1 = 2;
        short operand2 = 3;
        int result = operand1 + operand2;
    }

    @Test
    public void promoteResult() {
        byte operand1 = 2;
        short operand2 = 3;
        int result = operand1 + operand2;
    }
}
