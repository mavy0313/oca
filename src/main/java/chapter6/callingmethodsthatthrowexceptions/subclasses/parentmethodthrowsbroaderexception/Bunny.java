package chapter6.callingmethodsthatthrowexceptions.subclasses.parentmethodthrowsbroaderexception;

import chapter6.callingmethodsthatthrowexceptions.subclasses.CanNotHopException;

public class Bunny extends Hopper {
    public void hop() throws CanNotHopException { }
}
