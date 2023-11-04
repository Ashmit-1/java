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
        System.out.println("The addition of both matrices is as followes: ");
        int[][] result = add_mat(matrix1, matrix2);
        display(result);
        System.out.println("The product of two matrices is: ");
        int[][] mul = multiply(matrix1, matrix2);
        display(mul);
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

    }

    static void display(int[][] an_array) {
        // System.out.println("The matrix is: ");
        for (int[] ele : an_array) {
            System.out.println(Arrays.toString(ele) + " ");
        }
    }

    static int[][] add_mat(int[][] myArr1, int[][] myArr2) {
        int[][] result = new int[myArr1.length][myArr1[0].length];
        for (int i = 0; i < myArr1.length; i++) {
            for (int j = 0; j < myArr1[i].length; j++) {
                result[i][j] = myArr1[i][j] + myArr2[i][j];
            }
        }
        return result;

    }

    static int[][] multiply(int[][] arr1, int[][] arr2) {
        int[][] arr3 = new int[arr2.length][arr1[0].length];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[0].length; j++) {
                arr3[i][j] = 0;
            }
        }
        for (int k = 0; k < arr2.length; k++) {
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr2[i].length; j++) {
                    arr3[k][i] += (arr1[k][j] * arr2[j][i]);

                }
            }
        }
        return arr3;

    }
}
