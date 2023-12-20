import java.lang.Math;
import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int checkNum = sc.nextInt();
        if (checkArm(checkNum)) {
            System.out.println("The number " + checkNum + " is an Armstrong number.");
        } else {
            System.out.println("!!!!The number " + checkNum + " is not an Armstrong number!!!!");
        }
        sc.close();
    }

    static int digitLen(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count += 1;
        }
        return count;
    }

    static boolean checkArm(int n) {
        int check = n;
        int sum = 0;
        int index = digitLen(n);
        while (n > 0) {
            int digi = n % 10;
            sum += Math.pow(digi, index);
            n /= 10;
        }
        if (check == sum) {
            return true;
        } else {
            return false;
        }
    }
}
