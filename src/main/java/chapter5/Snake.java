package chapter5;

public class Snake extends Reptile {
    @Override
    protected boolean hasLegs() {
        return false;
    }

    @Override
    protected double getWeight() throws InsufficientDataException {
        return 2;
    }
}
