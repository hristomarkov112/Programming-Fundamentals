import java.util.Scanner;

public class _11_MathOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int firstNumber = Integer.parseInt(sc.nextLine());
        String operator = sc. nextLine();
        int secondNumber = Integer.parseInt(sc.nextLine());

        double result = calculate(firstNumber, operator, secondNumber);

        System.out.printf("%.0f", result);
    }

    public static double calculate(int a, String operator, int b) {
        double result = 0;

        switch (operator) {
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
        }

        return result;
    }
}
