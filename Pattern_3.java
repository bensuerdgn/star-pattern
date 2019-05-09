package pattern_3;

public class Pattern_3 {

    public static void main(String[] args) {

         for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i > j) {
                    System.out.print("* ");
                }
            }
            System.out.println("");

        }
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                if (j > i) {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
       
    }

}
