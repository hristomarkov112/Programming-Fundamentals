import java.util.Scanner;

public class _3_GamingStore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double price = 0;
        double totalSpent = 0;
        boolean outofMoney = false;

        double currentBalance = Double.parseDouble(sc.nextLine());

        String command = sc.nextLine();
        while (!command.equals("Game Time")) {
            String gameName = command;

            if (currentBalance <= 0) {
                System.out.println("Out of money%n");
                break;
            }

            switch (gameName) {
                case "OutFall 4":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }

            if (currentBalance < price) {
                System.out.println("Too Expensive");
            } else if (currentBalance >= price && price != 0){
                System.out.printf("Bought %s%n", gameName);
                currentBalance -= price;
                totalSpent += price;

            }

            if (currentBalance <= 0) {
                System.out.println("Out of money!");
                outofMoney = true;
                break;
            }

            command = sc.nextLine();
        }

        if (!outofMoney) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, currentBalance);
        }
    }
}
