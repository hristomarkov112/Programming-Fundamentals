import java.util.Scanner;

public class _10_MultiplyEvensByOdds {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Math.abs(Integer.parseInt(sc.nextLine()));

        int result = getMultipleOfEvensAndOds(n);

        System.out.println(result);
    }

    public static int getMultipleOfEvensAndOds(int n) {

        int evenSum = getSumOfEvens(n);
        int oddsSum = getSumOfOdds(n);

        return evenSum * oddsSum;

    }

    public static int getSumOfEvens(int n) {
        int evensSum = 0;
        while(n >= 0) {
            int digit = n % 10;

            if(digit % 2 == 0) {
                evensSum += digit;
            }
            n /= 10;
        }
        return evensSum;
    }

    public static int getSumOfOdds(int n) {
        int oddsSum = 0;
        while(n >= 0) {
            int digit = n % 10;

            if(digit % 2 != 0) {
                oddsSum += digit;
            }
            n /= 10;
        }
        return oddsSum;
    }
}
