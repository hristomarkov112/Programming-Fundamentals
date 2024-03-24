import java.util.Arrays;
import java.util.Scanner;

public class _9_ArrayModifier {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = sc.nextLine();
        while(!command.equals("end")) {
            if (command.contains("swap")) {

                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int firstIndexNumber = numbers[index1];
                int secondIndexNumber = numbers[index2];

                numbers[index1] = secondIndexNumber;
                numbers[index2] = firstIndexNumber;
            }

            if (command.contains("multiply")) {

                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int firstIndexNumber = numbers[index1];
                int secondIndexNumber = numbers[index2];

                int product = firstIndexNumber * secondIndexNumber;
                numbers [index1] = product;
            }

            if (command.equals("decrease")) {
                for (int index = 0; index <= numbers.length - 1; index++) {
                    numbers[index] -= 1;
                }
            }

            command = sc.nextLine();
        }

        System.out.println(Arrays
                .toString(numbers)
                .replace("[", "")
                .replace("]", "")
        );
    }
}
