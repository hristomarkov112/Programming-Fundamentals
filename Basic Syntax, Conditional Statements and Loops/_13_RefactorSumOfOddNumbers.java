import java.util.Scanner;

public class _13_RefactorSumOfOddNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 1; i <= 2 * n; i+= 1) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.printf("Sum: %d%n", sum);


    }
}
