package chapter5.interfaces.defaultmethods;

public interface Run {
    public default int getSpeed() {
        return 10;
    }
}
