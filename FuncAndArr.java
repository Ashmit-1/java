import java.util.Arrays;
import java.util.Scanner;

public class FuncAndArr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of items in the array: ");
        int length = scan.nextInt();
        int[] nums = new int[length];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter the " + (i + 1) + " element: ");
            int element = scan.nextInt();
            nums[i] = element;

        }
        System.out.println(Arrays.toString(nums));
        change(nums);
        scan.close();
    }

    static void change(int[] My_arr) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the position: ");
        int index = scan.nextInt();
        System.out.println("Enter the value: ");
        int value = scan.nextInt();
        My_arr[index] = value;
        System.out.println("The changed array is: ");
        System.out.println(Arrays.toString(My_arr));
        scan.close();
    }

}
