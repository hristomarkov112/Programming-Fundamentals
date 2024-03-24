import java.util.Scanner;

public class _8_BeerKegs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        double maxNumber = Double.MIN_VALUE;
        String maxVolumeKeg = "";

        for (int i = 1; i <= n ; i++) {
            String model = sc.nextLine();
            double radius = Double.parseDouble(sc.nextLine());
            int height = Integer.parseInt(sc.nextLine());

            double volume = Math.PI * radius * radius * height;

            if (volume > maxNumber) {
                maxVolumeKeg = model;
                maxNumber = volume;
            }
        }
        System.out.printf (maxVolumeKeg);
    }
}
