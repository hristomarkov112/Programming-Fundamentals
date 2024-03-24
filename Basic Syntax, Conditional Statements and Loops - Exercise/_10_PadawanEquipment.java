import java.util.Scanner;

public class _10_PadawanEquipment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double amountMoney = Double.parseDouble(sc.nextLine());
        int countStudents = Integer.parseInt(sc.nextLine());
        double priceLightSabers = Double.parseDouble(sc.nextLine());
        double priceRobes = Double.parseDouble(sc.nextLine());
        double priceBelts = Double.parseDouble(sc.nextLine());

        double totalLightSabers = priceLightSabers * Math.ceil(countStudents * 1.10);
        double totalRobes = priceRobes * countStudents;

        int countFreeBelts = countStudents / 6;
        double totalBelts = priceBelts * (countStudents - countFreeBelts);

        double total = totalLightSabers + totalRobes + totalBelts;
        double diff = total - amountMoney;

        if (total <= amountMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", diff);
        }

    }
}
