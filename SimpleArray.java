import java.util.Scanner;

public class SimpleArray {
    public static void main(String[] args) {
        EnterData(5);

    }

    static void EnterData(int x) {
        Scanner scan = new Scanner(System.in);
        int[] new_arr = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Enter data for " + i + "node of array: ");

            int value = scan.nextInt();
            new_arr[i] = value;
            scan.close();

        }

    }
}
