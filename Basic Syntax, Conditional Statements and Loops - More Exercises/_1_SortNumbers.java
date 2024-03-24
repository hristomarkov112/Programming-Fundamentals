import java.util.Scanner;

public class _1_SortNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        int num3 = Integer.parseInt(sc.nextLine());

        // Arrange in descending order
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num1 < num3) {
            int temp = num1;
            num1 = num3;
            num3 = temp;
        }

        if (num2 < num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
