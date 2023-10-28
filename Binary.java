import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        int num;
        Scanner scan_number = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        num = scan_number.nextInt();
        int binary_num = 0;
        while (num != 0) {
            binary_num = binary_num * 10 + num % 2;
            num /= 2;

        }
        scan_number.close();
        System.out.println("The binary number is: " + binary_num);

    }
}
