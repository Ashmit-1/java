import java.util.Scanner;

public class ListArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter particular digit: ");
        int num = scan.nextInt();
        count_Armstrong(num);
        scan.close();
    }

    static void count_Armstrong(int x) {
        System.out.println("The " + x + " digited Armstrong numbers are: ");
        for (int i = (int) Math.pow(10, x - 1); i <= ((int) Math.pow(10, x) - 1); i++) {
            if (armstrong(i)) {
                System.out.print(i + "  ");
            }
        }
    }

    static boolean armstrong(int x) {
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
            return true;
        } else {
            return false;
        }
    }
}
