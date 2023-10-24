import java.util.ArrayList;

public class PlusOne {
    public static void main(String[] args) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        digits.add(9);
        digits.add(9);

        // for (int i = 0; i < digits.size(); i++) {
        // System.out.println(digits[i]);
        // }
        if (digits[digits.size() - 1] != 9) {
            digits[digits.size() - 1] += 1;
        } else {
            for (int i = digits.size() - 1; i >= 0; i--) {
                if (digits[i] == 9 && i != 0) {
                    digits[i] = 0;

                } else if (digits[i] == 9 && i == 0) {
                    digits[i] = 1;
                    digits.add(0);

                } else {
                    digits[i] += 1;
                    break;
                }

            }

        }
        for (int i = 0; i < digits.size(); i++) {
            System.out.print(digits[i]);
        }

    }
}
// if(digits[len(digits)-1]!=9):
// digits[len(digits)-1] += 1
// else:
// for i in range(len(digits)-1,-1,-1):
// if(digits[i]==9 and i != 0):
// digits[i]=0
// elif(digits[i]==9 and i == 0):
// digits[i]=1
// digits.append(0)
