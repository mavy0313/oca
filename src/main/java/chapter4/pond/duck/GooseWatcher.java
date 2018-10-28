package chapter4.pond.duck;

import chapter4.pond.goose.Goose;

public class GooseWatcher {

    public void watch() {
        Goose goose = new Goose();
//        goose.floatInWater(); // DOES NOT COMPILE

//        This code doesn’t compile because we are not in the Goose class. The floatInWater()
//        method is declared in Bird. GooseWatcher is not in the same package as Bird, nor does it
//        extend Bird. Goose extends Bird. That only lets Goose refer to floatInWater() and not
//        callers of Goose.
    }
}
