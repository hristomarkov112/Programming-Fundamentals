import java.util.Scanner;

public class _10_MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

            for (int j = 1; j <= 10 ; j++) {
                System.out.printf("%d X %d = %d%n", n, j, n * j);
            }

    }
}
