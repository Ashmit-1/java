import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to reverse: ");
        int num = scan.nextInt();
        reversing(num);
        scan.close();
    }

    static void reversing(int x) {
        int temp = 0;
        while (x != 0) {
            temp = temp * 10 + (x % 10);
            x /= 10;
        }
        System.out.println("The reversed number is: " + temp);
    }
}
