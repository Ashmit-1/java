import java.util.Scanner;

public class PowerOfFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        scan.close();
        check_power(num);

    }

    static void check_power(int n) {
        int count = 0;
        int temp = n;
        while (n > 1) {
            n /= 4;
            count++;
        }
        if (temp == Math.pow(4, count)) {
            System.out.println(temp + " is a number with power of 4.");
        } else {
            System.out.println("!!! " + temp + " is not a number with power of 4!!!");
        }

    }
}
