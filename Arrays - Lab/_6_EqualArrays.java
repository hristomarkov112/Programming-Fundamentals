import java.util.Arrays;
import java.util.Scanner;

public class _6_EqualArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers1 = Arrays
                .stream(sc.nextLine()
                .split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] numbers2 = Arrays
                .stream(sc.nextLine()
                        .split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int numbersSum = 0;
        boolean areIdentical = false;

        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] != numbers2[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areIdentical = false;
                break;
            } else {
                int number = numbers1[i];
                numbersSum += number;
                areIdentical = true;
            }
        }

        if (areIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", numbersSum);
        }
    }
}
