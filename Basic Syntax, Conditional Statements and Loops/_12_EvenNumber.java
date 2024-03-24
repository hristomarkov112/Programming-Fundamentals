import java.util.Scanner;

public class _12_EvenNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        while (number % 2 != 0) {
                System.out.println("Please write an even number.");
                number = Integer.parseInt(sc.nextLine());
        }

        System.out.printf("The number is: %d", Math.abs(number));


    }
}
