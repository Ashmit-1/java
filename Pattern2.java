import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter limit: ");
        int lim = input.nextInt();
        int flag = lim / 2;
        for (int i = 0; i < lim; i += 2) {
            for (int j = 0; j < flag; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j <= i; j++) {
                if (true) {
                    System.out.print("*");
                }
                // else {
                // System.out.print(" ");
                // }
            }
            flag -= 1;
            System.out.println();

        }
        input.close();
    }
}
