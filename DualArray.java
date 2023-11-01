import java.util.Arrays;
import java.util.Scanner;

public class DualArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int rows = input.nextInt();
        int cols = input.nextInt();
        int[][] matrix = new int[rows][cols];
        input_data(matrix);
        display(matrix);
        input.close();

    }

    static void input_data(int[][] my_arr) {
        Scanner in = new Scanner(System.in);
        int row = my_arr.length;
        int col = my_arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the value of (" + (i + 1) + ", " + (j + 1) + ") element: ");
                int val = in.nextInt();
                my_arr[i][j] = val;

            }
        }
        in.close();
    }

    static void display(int[][] MyArr) {
        int row = MyArr.length;
        System.out.println("The desired matrix is as followes: ");
        for (int i = 0; i < row; i++) {
            // for (int j = 0; j < col; j++) {
            // System.out.print(MyArr[i][j] + " ");
            // }
            System.out.println(Arrays.toString(MyArr[i]));
            // System.out.println();
        }
    }
}