import java.util.Scanner;

public class _2_SumDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        int total = 0;

        while (number > 0) {
            int lastDigit = number % 10;

            total += lastDigit;

            number /= 10;
        }

        System.out.println(total);

    }

}
