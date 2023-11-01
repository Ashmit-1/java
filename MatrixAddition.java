import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int rows = enter.nextInt();
        int cols = enter.nextInt();
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        System.out.println("Enter data for matrix1: ");
        enter_data(matrix1);
        System.out.println("Enter data for matrix2: ");
        enter_data(matrix2);
        System.out.println("Matrix1 is as followes: ");
        display(matrix1);
        System.out.println("Matrix2 is as followes: ");
        display(matrix2);
        enter.close();

    }

    static void enter_data(int[][] an_array) {
        Scanner input_val = new Scanner(System.in);
        for (int i = 0; i < an_array.length; i++) {
            for (int j = 0; j < an_array[i].length; j++) {
                System.out.println("Enter data for (" + (i + 1) + ", " + (j + 1) + ") position");
                int value = input_val.nextInt();
                an_array[i][j] = value;

            }
        }
        input_val.close();
    }

    static void display(int[][] an_array) {
        System.out.println("The matrix is: ");
        for (int[] ele : an_array) {
            System.out.println(Arrays.toString(ele) + " ");
        }
    }
}
