import java.util.Scanner;

public class _11_RageExpenses {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int countLostGames = Integer.parseInt(sc.nextLine());
        double priceHeadset = Double.parseDouble(sc.nextLine());
        double priceMouse = Double.parseDouble(sc.nextLine());
        double priceKeyboard = Double.parseDouble(sc.nextLine());
        double priceDisplay = Double.parseDouble(sc.nextLine());

        int countHeadset = 0;
        int countMouse = 0;
        int countKeyboard = 0;
        int countDisplay = 0;
        int losses = 0;

        for (int i = 1; i <= countLostGames ; i++) {

            losses += 1;

            if (losses % 2 == 0) {
                countHeadset += 1;
            }

            if (losses % 3 == 0) {
                countMouse += 1;
            }

            if (losses % 2 == 0 && losses % 3 == 0) {
                countKeyboard += 1;

                if (countKeyboard % 2 == 0) {
                    countDisplay += 1;
                }
            }
        }

        double total = priceHeadset * countHeadset + priceMouse * countMouse + priceKeyboard * countKeyboard + priceDisplay * countDisplay;

        System.out.printf("Rage expenses: %.2f lv.", total);
    }
}
