package chapter5.constructors;

import chapter5.constructors.Primate;

public class Ape extends Primate {
    public Ape() {
        //super(); Compiler will insert super() automatically
        System.out.println("Ape");
    }
}
