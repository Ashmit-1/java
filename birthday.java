import java.util.Scanner;

public class birthday {
    public static void main(String[] args) {
        System.out.println("Enter your birthday: ");
        Scanner bday = new Scanner(System.in);
        int birDay = bday.nextInt();
        // String isBday = (birDay == 12) ? "Congrats!!\nThis is your birthday !!!":
        // "Sorry :( \nThis is not your birthday";
        System.out.println(
                (birDay == 12) ? "Congrats!!\nThis is your birthday !!!" : "Sorry :( \nThis is not your birthday");
        bday.close();

    }

}
