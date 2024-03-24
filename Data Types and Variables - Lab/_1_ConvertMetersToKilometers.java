import java.util.Scanner;

public class _1_ConvertMetersToKilometers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());

        double total = a / 1000.0;

        System.out.printf("%.2f", total);
    }
}

