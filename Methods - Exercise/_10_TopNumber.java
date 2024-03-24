import java.util.Scanner;

public class _10_TopNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int number = 1; number <= n ; number++) {
            boolean isValidSumDigits = checkSumDigitsDivisibleBy8(number);
            boolean isContainsOddDigit = checkContainsOddNumber(number);

            if (isValidSumDigits && isContainsOddDigit) {
                System.out.println(number);
            }
        }

    }

    public static boolean checkSumDigitsDivisibleBy8 (int number) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }

        if (sum % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkContainsOddNumber (int number) {
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                number /= 10;
            }
        }
        return false;
    }
}
