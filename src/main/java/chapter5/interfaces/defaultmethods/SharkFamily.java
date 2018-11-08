package chapter5.interfaces.defaultmethods;

public interface SharkFamily extends HasFins {
    public default int getNumberOfFins() {
        return 8;
    }
    public double getLongestFinLength();
//    public boolean doFinsHaveScales() { // DOES NOT COMPILE
//        return false;
//    }
}
