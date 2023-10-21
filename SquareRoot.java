public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(root(1978959248));

    }

    // static int root(int x) {
    // double i = 1;
    // while (i * i <= x) {
    // i += 1;
    // }
    // return (int) (i - 1);
    // }
    static int root(double x) {
        double j;
        for (j = x / 2; j * j > x; j--) {
        }
        return x == 1 ? 1 : (int) j;
    }
}
