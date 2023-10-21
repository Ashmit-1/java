public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(root(2147395600));

    }

    static int root(int x) {
        double i = 1;
        while (i * i <= x) {
            i += 1;
        }
        return (int) (i - 1);
    }
}
