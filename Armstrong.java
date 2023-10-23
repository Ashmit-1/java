import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        armstrong(number);
        scan.close();
    }

    static void armstrong(int x) {
        int digits = 0;

        int temp = x;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }
        int arms_num = 0;
        temp = x;
        while (temp != 0) {
            arms_num += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        if (arms_num == x) {
            System.out.println("The number " + x + " is an Armstrong number.");
        } else {
            System.out.println("!!! The number " + x + " is not an Armstrong number !!!");
        }
    }
}
