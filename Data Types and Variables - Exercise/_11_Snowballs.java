import java.util.Scanner;

public class _11_Snowballs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        double maxValue = Double.MIN_VALUE;
        int maxSnow = 0;
        int maxTime = 0;
        int maxSnowballQuality = 0;

        for (int i = 1; i <= n ; i++) {
            int snowballSnow = Integer.parseInt(sc.nextLine());
            int snowballTime = Integer.parseInt(sc.nextLine());
            int snowballQuality = Integer.parseInt(sc.nextLine());

            double snowballValue = Math.pow(1.0 * snowballSnow / snowballTime, snowballQuality);

            if (maxValue < snowballValue) {
                maxValue = snowballValue;
                maxSnow = snowballSnow;
                maxTime = snowballTime;
                maxSnowballQuality = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", maxSnow, maxTime, maxValue, maxSnowballQuality);

    }
}
