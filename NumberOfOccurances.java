import java.util.Scanner;

public class NumberOfOccurances {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();

        System.out.println("Enter the number to check: ");
        int check_num = scan.nextInt();

        System.out.println("Number of " + check_num + " in " + num + " is " + count(num, check_num));
        scan.close();

    }

    static int count(int x, int y) {
        int count = 0;
        while (x != 0) {
            int temp = x % 10;
            if (temp == y)
                count++;

            x /= 10;
        }
        return count;
    }
}
