import java.util.Scanner;

public class SwichCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruit = "";
        while (fruit != "exit") {
            System.out.println("Enter a fruit: ");
            fruit = scan.next().toLowerCase();
            switch (fruit) {
                case "mango":
                    System.out.println("Yellow Fruit");
                    break;
                case "apple":
                    System.out.println("Red fruit");
                    break;
                case "orange":
                    System.out.println("Orange Fruit");
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("!!!Enter valid fruit!!!");
                    break;

            }

        }
        scan.close();
    }
}
