import java.sql.Array;
import java.util.Scanner;

public class _4_ArrayRotation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] numbers = sc.nextLine().split(" ");
        int rotations = Integer.parseInt(sc.nextLine());

        for (int rotation = 1; rotation <= rotations; rotation++) {
            String firstElement = numbers[0];

            for (int index = 0; index < numbers.length - 1; index++) {
                numbers[index] = numbers[index + 1];
            }

            numbers[numbers.length - 1] = firstElement;
        }

        for (String number : numbers) {
            System.out.print(number + " ");
        }
    }
}
