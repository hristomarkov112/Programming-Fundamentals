import java.util.Scanner;

public class _7_WaterOverflow1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int capacity = 255;
        int pouredLitres = 0;

        for (int i = 1; i <= n ; i++) {
            int litres = Integer.parseInt(sc.nextLine());

            if (litres > capacity) {
                System.out.println("Insufficient capacity!");
            } else {
                pouredLitres += litres;
                capacity -= litres;
            }
        }

        System.out.println(pouredLitres);

    }
}
