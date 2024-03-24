import java.util.Scanner;

public class _10_PokeMon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int power = Integer.parseInt(sc.nextLine());
        int distance = Integer.parseInt(sc.nextLine());
        int factor = Integer.parseInt(sc.nextLine());

        int startPower = power;

        int countPoked = 0;
        while (power >= distance) {
            power -= distance;
            countPoked++;

            if (power == startPower / 2) {

                if (factor != 0) {
                    power /= factor;
                }
            }
        }

        System.out.println(power);
        System.out.println(countPoked);

    }
}
