import java.util.Scanner;

public class _4_TownInfo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String city = sc.nextLine();
        int population = Integer.parseInt(sc.nextLine());
        int area = Integer.parseInt(sc.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", city, population, area);

    }
}
