/**
 * onePattern
 */
public class onePattern {

    public static void main(String[] args) {
        printPattern(5);
    }

    static void printPattern(int x) {
        int rows = 2 * x - 1;
        for (int i = 0; i < rows; i++) {
            int limit = i < x ? i : rows - i - 1;
            for (int j = 0; j <= limit; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
}