import java.util.Scanner;

public class _1_SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        defineNumber(number);
    }

    public static void defineNumber(int number) {

        if (number == 0) {
            System.out.printf("The number %d is zero.", number);
        } else if (number > 0 ) {
            System.out.printf("The number %d is positive.", number);
        } else {
            System.out.printf("The number %d is negative.", number);
        }
    }
}
