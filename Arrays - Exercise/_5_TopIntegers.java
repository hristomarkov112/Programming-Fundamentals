import java.util.Arrays;
import java.util.Scanner;

public class _5_TopIntegers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();



    }
}
