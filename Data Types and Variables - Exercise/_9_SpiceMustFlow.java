import java.net.InterfaceAddress;
import java.util.Scanner;

public class _9_SpiceMustFlow {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int startingYield = Integer.parseInt(sc.nextLine());


        int days = 0;
        int total = 0;

        while (startingYield >= 100) {

            days += 1;

            int spicePerDay = startingYield - 26;

            total += spicePerDay;
            startingYield -= 10;
        }

        total -= 26;

        if (total < 0) {
            total = 0;
        }

        System.out.println(days);
        System.out.println(total);

    }
}
