package chapter5.interfaces.defaultmethods;

public interface Walk {
    public default int getSpeed() {
        return 5;
    }
}
