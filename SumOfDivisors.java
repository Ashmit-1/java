import java.util.Scanner;

public class SumOfDivisors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int num = scan.nextInt();
        int sumain = 0;
        for (int i = 1; i <= num; i++) {

            sumain += divisors(i);
        }
        // for (int i = 1; i <= num; i++) {
        // int sum = 0;
        // for (int j = 1; i <= Math.sqrt(i); j++) {
        // if (i % j == 0) {
        // sum = sum + j + (j != (i / j) ? (i / j) : 0);
        // System.out.println("Run" + j);
        // }
        // System.out.println("Run Two" + i);
        // sumain += sum;
        // }

        // }
        System.out.println(sumain);
        scan.close();

    }

    // static int divisors(int x) {
    // int sum = 0;
    // for (int i = 1; i <= x; i++) {
    // if (x % i == 0) {
    // sum = sum + i;
    // }
    // }

    // return sum;
    // }

    static int divisors(int x) {
        int sum = 0;

        for (int i = 1; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                sum = sum + i + (i != (x / i) ? (x / i) : 0);
            }
        }

        return sum;
    }
}
