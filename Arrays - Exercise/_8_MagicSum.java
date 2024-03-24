import java.util.Arrays;
import java.util.Scanner;

public class _8_MagicSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int magicSum = Integer.parseInt(sc.nextLine());

        for (int index = 0; index < numbers.length - 1; index++) {
            int currentNumber = numbers[index];

            for (int i = index + 1; i < numbers.length; i++) {
                int nextNumber = numbers[i];

                if (currentNumber + nextNumber == magicSum) {
                    System.out.println(currentNumber + " " + nextNumber);
                }
            }
        }
    }
}
