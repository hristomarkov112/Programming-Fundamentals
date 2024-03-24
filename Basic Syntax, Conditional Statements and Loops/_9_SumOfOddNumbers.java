import java.util.Scanner;

public class _9_SumOfOddNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int total = 0;

        for (int i = 1; i <= 2 * n ; i += 1) {
            if (i % 2 != 0) {
                System.out.println(i);
                total += i;
            }
        }

        System.out.printf("Sum: %d", total);


    }
}
