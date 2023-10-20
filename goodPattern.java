import java.util.Scanner;

public class goodPattern {
    public static void main(String[] args) {
        Scanner variablScanner = new Scanner(System.in);
        System.out.println("Enter the number of columns you want to insert: ");
        int a = variablScanner.nextInt();
        pattern(a);
        variablScanner.close();
    }

    static void pattern(int x) {
        int rows = 2 * x - 1;
        for (int i = 1; i <= rows; i++) {
            int col = i <= x ? i : rows - i + 1;
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
