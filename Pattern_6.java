package pattern_8;

public class Pattern_8 {

    public static void main(String[] args) {
         for (int i = 1; i <= 10; i++) {
            for (int j = 9; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
          for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 9; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
