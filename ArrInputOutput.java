import java.util.Arrays;
import java.util.Scanner;

public class ArrInputOutput {
    public static void main(String[] args) {
        int[] myArr = new int[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < myArr.length; i++) {

            System.out.println("Enter the data of the " + (i + 1) + " node: ");
            myArr[i] = input.nextInt();

        }
        for (int i : myArr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(myArr));
        input.close();

    }

}
