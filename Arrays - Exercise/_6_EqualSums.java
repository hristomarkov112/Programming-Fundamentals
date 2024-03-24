import java.util.Arrays;
import java.util.Scanner;

public class _6_EqualSums {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int index = 0; index <= numbers.length - 1; index++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int leftIndex = 0; leftIndex < index ; leftIndex++) {
                leftSum += numbers[leftIndex];
            }

            for (int rightIndex = index + 1; rightIndex <= numbers.length - 1 ; rightIndex++) {
                rightSum += numbers[rightIndex];
            }

            if(leftSum == rightSum) {
                System.out.println(index);
                return;
            }
        }
    }
}
