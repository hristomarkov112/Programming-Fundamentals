import java.util.Scanner;

public class _5_AddAndSubtract {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int firstNumber = Integer.parseInt(sc.nextLine());
        int secondNumber = Integer.parseInt(sc.nextLine());
        int thirdNumber = Integer.parseInt(sc.nextLine());

        int sum = sum(firstNumber, secondNumber);
        int diff = subtract(sum, thirdNumber);

        System.out.println(diff);
    }

    public static int sum(int n1, int n2) {

        return n1 + n2;
    }

    public static int subtract(int n1, int n2) {

        return n1 - n2;
    }


}
