import java.math.BigDecimal;
import java.util.Scanner;

public class _3_ExactSumOfRealNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        BigDecimal sum = new BigDecimal("0");

        for (int i = 1; i <= n ; i++) {
            BigDecimal number = new BigDecimal(sc.nextLine());
            sum = sum.add(number);
        }

        System.out.println(sum);

    }
}
