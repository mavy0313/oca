package chapter5.interfaces.defaultmethods;

public interface IsWarmBlooded {
    boolean hasScales();
    public default double getTemperature() {
        return 10.0;
    }
}
