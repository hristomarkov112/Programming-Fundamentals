import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class _1_SumAdjacentEqualNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Double> numbers = Arrays
                .stream(sc.nextLine()
                        .split(" "))
                .map(e -> Double.parseDouble(e))
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            double currentElement = numbers.get(i);
            double rightElement = numbers.get(i + 1);
            if (currentElement == rightElement) {
                double newElement = currentElement + rightElement;
                numbers.remove(i + 1);
                numbers.set(i, newElement);
                i = -1;
            }
        }

        for (double num:numbers) {
            System.out.print(new DecimalFormat("0.###").format(num) + " ");
        }
    }
}
