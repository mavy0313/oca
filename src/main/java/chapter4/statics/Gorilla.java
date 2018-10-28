package chapter4.statics;

public class Gorilla {
    public static int count;
    public static void addGorilla() { count++; }
    public void babyGorilla() { count++; }

    public void announceBabies() {
        addGorilla();
        babyGorilla();
    }
    public static void announceBabiesToEveryone() {
        addGorilla();
//        babyGorilla(); // DOES NOT COMPILE
    }

    public int total;
//    public static int average = total / count; // DOES NOT COMPILE
}
