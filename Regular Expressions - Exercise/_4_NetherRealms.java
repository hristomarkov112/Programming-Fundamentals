import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _4_NetherRealms {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] demonNames = sc.nextLine().split("\\s*,\\s+");

        for (String demonName: demonNames) {
            int health = getDemonsHealth(demonName);
            double damage = getDemonsDamage(demonName);

            for (char symbol : demonName.toCharArray()) {
                if (symbol == '*') {
                    damage *= 2;
                } else if (symbol == '/') {
                    damage /= 2;
                }
            }

            System.out.printf("%s - %d health, %.2f damage%n", demonName, health, damage);
        }
    }

    private static int getDemonsHealth(String demonName) {
        int health = 0;

        Pattern pattern = Pattern.compile("[^\\+\\-\\*\\/0-9\\.]");
        Matcher matcher = pattern.matcher(demonName);

        while (matcher.find()) {
            health += matcher.group().charAt(0);
        }

        return  health;
    }

    private static double getDemonsDamage(String demonName) {
        double damage = 0;
        Pattern pattern = Pattern.compile("[-]?\\d+\\.?\\d*");
        Matcher matcher = pattern.matcher(demonName);
        while (matcher.find()) {
            damage += Double.parseDouble(matcher.group());
        }

        return damage;
    }


}
