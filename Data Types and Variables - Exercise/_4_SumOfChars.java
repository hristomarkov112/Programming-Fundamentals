import java.util.Scanner;

public class _4_SumOfChars {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int total = 0;

        for (int i = 1; i <= n ; i++) {
            char letter = sc.nextLine().charAt(0);

            total += letter;
        }

        System.out.printf("The sum equals: %d", total);
    }
}
