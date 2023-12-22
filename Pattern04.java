import java.util.Scanner;

public class Pattern04 {
    static void invertedTriangle(int x) {
        int x1 = x;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < x1; j++) {
                System.out.print("*" + " ");
            }
            x1 -= 1;
            System.out.println();
        }
    }

    static void triangle(int x) {
        int x1 = x;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x1 - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            x1 -= 1;
            System.out.println();
        }
    }

    static void invertedHollowTriangle(int x) {
        int x1 = x;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < x1; j++) {
                if (j == 0 || j == x1 - 1 || i == 0) {

                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            x1 -= 1;
            System.out.println();
        }
    }

    static void hollowTriangle(int x) {
        int x1 = x;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x1 - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == x - 1) {

                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            x1 -= 1;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int lim = in.nextInt();
        triangle(lim);
        invertedTriangle(lim);
        invertedHollowTriangle(lim);
        hollowTriangle(lim);
        in.close();
    }
}
