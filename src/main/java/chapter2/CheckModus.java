package chapter2;

public class CheckModus {
    public static void main(String[] args) {
        System.out.println("2 / 2 = " + 2 / 2);
        System.out.println("1 / 2 = " + 1 / 2);
        System.out.println("1 % 2 = " + 1 % 2);
        System.out.println("1 * 1 % 2 = " + 1 * 1 % 2);

//        byte x = 5;
//        byte y = 10;
//        double z = x + y;
//        System.out.println(z);

//        String message = false;

//        long x = 10;
//        int y = 2 * x;
        if(true) System.out.println("Too Low");
        else System.out.println("Just right");
//        else System.out.println("Too High");



        boolean x = true, z = true;
        boolean test = z=false;
        System.out.println(test);

        int y = 20;
        x = (y != 10) ^ (z=false);
        System.out.println(x+", "+y+", "+z);

        int count = 0;
        ROW_LOOP: for(int row = 1; row <=3; row++)
            for (int col = 1; col <=2 ; col++) {
                if (row * col % 2 == 0) continue ROW_LOOP;
                count++;
            }

        System.out.println(count);
        promote();
    }

    public static void promote() {
        int x = 1;
        long y = 33;
        long xMultY = x * y;
        System.out.println(xMultY);
    }
}
