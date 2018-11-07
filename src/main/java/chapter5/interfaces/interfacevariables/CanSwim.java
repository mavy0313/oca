package chapter5.interfaces.interfacevariables;

public interface CanSwim {
    int MAXIMUM_DEPTH = 100;
    final static boolean UNDERWATER = true;
    public static final String TYPE = "Submersible";
}

//the compile will automatically insert public static final to
//any constant interface variables it finds missing those modifiers.

//public interface CanSwim {
//    public static final int MAXIMUM_DEPTH = 100;
//    public static final boolean UNDERWATER = true;
//    public static final String TYPE = "Submersible";
//}
