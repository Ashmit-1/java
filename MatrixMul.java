import java.util.Arrays;
import java.util.Scanner;

public class MatrixMul {
    static int[][] enterData(int rows) {
        int[][] matrix = new int[rows][rows];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter data: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        return matrix;
    }

    static void display(int[][] matrix) {
        System.out.println("The matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));

        }
    }

    static int[][] matMul(int[][] mat1, int[][] mat2) {
        int[][] result = new int[mat1.length][mat1.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = 0;
            }
        }
        for (int a = 0; a < result.length; a++) {
            for (int b = 0; b < result.length; b++) {
                for (int c = 0; c < result.length; c++) {
                    result[c][a] += mat1[c][b] * mat2[b][a];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix1 = enterData(3);
        int[][] matrix2 = enterData(3);
        display(matrix1);
        display(matrix2);
        display(matMul(matrix1, matrix2));
    }
}