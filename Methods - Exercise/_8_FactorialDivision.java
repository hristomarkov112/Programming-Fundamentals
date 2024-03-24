import java.util.Scanner;

public class _8_FactorialDivision {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int firstNumber = Integer.parseInt(sc.nextLine());
        int secondNumber = Integer.parseInt(sc.nextLine());

        long factFirstNumber = firstNumberFactorial (firstNumber);
        long factSecondnumber = secondNumberFactorial (secondNumber);
        double result = 1.0 * factFirstNumber / factSecondnumber;
        System.out.printf("%.2f", result);

    }

    public static long firstNumberFactorial(int n1) {
        long fact = 1;

        for (int i = 1; i <= n1; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long secondNumberFactorial(int n2) {
        long fact = 1;

        for (int i = 1; i <= n2; i++) {
            fact *= i;
        }
        return fact;
    }
}
