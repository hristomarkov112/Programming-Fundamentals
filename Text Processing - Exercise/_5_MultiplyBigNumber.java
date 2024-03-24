import java.math.BigInteger;
import java.util.Scanner;

public class _5_MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstNumber = sc.nextLine();
        int secondNumber = Integer.parseInt(sc.nextLine());

        StringBuilder result = new StringBuilder();
        int over = 0;

        for (int position = 0; position < firstNumber.length() - 1; position++) {
            int digit = Integer.parseInt((firstNumber.charAt(position) + ""));
            int product = digit * secondNumber;

            over = product / 10;
            result.insert(0, product % 10);
        }


    }
}
