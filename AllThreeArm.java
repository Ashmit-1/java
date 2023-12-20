import java.lang.Math;

public class AllThreeArm {

    public static void main(String[] args) {
        System.out.println("_______________________________________");
        System.out.println("The three digit Armstrong Numbers are: ");
        System.out.println("_______________________________________");
        for (int i = 100; i < 1000; i++) {
            if (checkArm(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("_______________________________________");
    }

    static int digiLen(int n) {
        String count;
        count = Integer.toString(n);
        return count.length();
    }

    static boolean checkArm(int n) {
        int test = n;
        int sum = 0;
        int index = digiLen(n);
        while (n > 0) {
            int digi = n % 10;
            sum += Math.pow(digi, index);
            n /= 10;
        }
        if (sum == test) {
            return true;
        } else {
            return false;
        }
    }
}
