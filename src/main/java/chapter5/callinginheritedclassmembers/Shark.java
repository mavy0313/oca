package chapter5.callinginheritedclassmembers;

import chapter5.callinginheritedclassmembers.Fish;

public class Shark extends Fish {
    private int numberOfFins = 8;

    public Shark(int age) {
        super(age);
        this.size = 4;
    }

    public void displaySharkDetails() {
        System.out.print("Shark with age: " + getAge());
        System.out.print(" and " + size + " meters long");
        System.out.print(" with " + numberOfFins + " fins");
    }

//    public void displaySharkDetails() {
//        System.out.print("Shark with age: "+this.getAge());
//        System.out.print(" and "+this.size+" meters long");
//        System.out.print(" with "+this.numberOfFins+" fins");
//    }

//    public void displaySharkDetails() {
//        System.out.print("Shark with age: "+super.getAge());
//        System.out.print(" and "+super.size+" meters long");
//        System.out.print(" with "+this.numberOfFins+" fins");
//    }

//    public void displaySharkDetails() {
//        System.out.print("Shark with age: "+super.getAge());
//        System.out.print(" and "+super.size+" meters long");
//        System.out.print(" with "+super.numberOfFins+" fins"); // DOES NOT COMPILE
//    }
}
