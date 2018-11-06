package chapter5.overridingvshiding;

public class KangarooOverriden extends MarsupialOverriden {
    public boolean isBiped() {
        return true;
    }
    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: "+isBiped());
    }
    public static void main(String[] args) {
        KangarooOverriden joey = new KangarooOverriden();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();

//        output:
//        Marsupial walks on two legs: true
//        Kangaroo hops on two legs: true
    }
}
