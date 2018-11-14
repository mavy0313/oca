package chapter6.callingmethodsthatthrowexceptions.subclasses.runtime;

import chapter6.callingmethodsthatthrowexceptions.subclasses.Hopper;

public class Bunny extends Hopper {
    public void hop() throws IllegalStateException { } //Ok for runtime exceptions - they are redundant
}
