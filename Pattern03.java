import java.util.Scanner;

public class Pattern03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int lim = in.nextInt();
        int lim2 = lim;
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < lim2 - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == lim - 1) {

                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            lim2 -= 1;
            System.out.println();
        }
        in.close();
    }
}
