import java.util.Arrays;
import java.util.Scanner;

public class _5_EvenAndOddSubtraction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(sc.nextLine()
                .split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int oddSum = 0;
        int evenSum = 0;

        for (int number:numbers) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        int diff = evenSum - oddSum;
        System.out.println(diff);
    }
}
