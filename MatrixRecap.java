import java.util.Scanner;

public class MatrixRecap {
    public static void main(String[] args) {
        int[][] matrix1 = input_mat();
        // int[][] matrix2 = input_mat();
        display_mat(matrix1);
        // display_mat(matrix2);
        // System.out.println("The sum of the 2 matrices is: ");
        // display_mat(mat_add(matrix1, matrix2));
        // System.out.println("The product of the 2 matrices is: ");
        // display_mat(mat_mul(matrix1, matrix2));

    }

    static int[][] input_mat() {
        System.out.println();
        Scanner input = new Scanner(System.in);
        int rows, cols;
        System.out.println("Enter the number of rows: ");
        rows = input.nextInt();
        System.out.println("Enter the number of columns: ");
        cols = input.nextInt();
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Enter the value for (" + (i + 1) + ", " + (j + 1) + "): ");
                mat[i][j] = input.nextInt();
            }
        }
        // input.close();
        return mat;

    }

    static void display_mat(int[][] x) {
        // for (int rows = 0; rows < x.length; rows++) {
        // for (int cols = 0; cols < x[rows].length; cols++) {
        // System.out.print(x[rows][cols] + " ");

        // }
        // System.out.println();
        // }
        // System.out.println();
        for (int i = 0; i < x.length; i++) {
            for (int is : x[i]) {
                System.out.print(is + " ");

            }
            System.out.println();
        }
    }

    // static int[][] mat_add(int[][] x, int[][] y) {
    // int[][] sum = new int[x.length][x[0].length];
    // for (int i = 0; i < x.length; i++) {
    // for (int j = 0; j < x[i].length; j++) {
    // sum[i][j] = x[i][j] + y[i][j];
    // }

    // }
    // return sum;
    // }

    // static int[][] mat_mul(int[][] x, int[][] y) {
    // int[][] product = new int[x.length][y[0].length];
    // for (int i = 0; i < product.length; i++) {
    // for (int j = 0; j < product[i].length; j++) {
    // product[i][j] = 0;

    // }
    // }
    // for (int i = 0; i < product.length; i++) {
    // for (int j = 0; j < product[i].length; j++) {
    // for (int k = 0; k < product.length; k++) {
    // product[k][i] += x[k][j] * y[j][i];
    // }

    // }
    // }
    // return product;
    // }

}
