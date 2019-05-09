package pattern_2;

public class Pattern_2 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j>i; j--) {
                if (j>i) {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }

}
