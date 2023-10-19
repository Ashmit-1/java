import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("Nomoskar \n Bhalo achen");

        // if (1>0)
        // {
        // System.out.println("True");

        // } else {
        // System.out.println("false");

        // }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("You have entered: " + str);

        Scanner int_scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = int_scan.nextInt();
        System.out.println("You have entered: " + a);

        if (a <= 99) {
            System.out.println("This is a two digit integer.");

        } else {
            System.out.println("This is a not a two digit integer.");

        }
        sc.close();
        int_scan.close();

    }
}
