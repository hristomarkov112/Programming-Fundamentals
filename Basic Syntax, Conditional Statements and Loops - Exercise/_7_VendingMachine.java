import java.util.Scanner;

public class _7_VendingMachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double price = 0.0;
        double totalAmount = 0.0;
        boolean invalidProduct = false;

        String command = sc.nextLine();
        while (!command.equals("Start")) {
            double currentAmount = Double.parseDouble(command);

            if (currentAmount == 0.1 || currentAmount == 0.2 || currentAmount == 0.3 || currentAmount == 0.5 || currentAmount == 1.0 || currentAmount == 2.0) {
                totalAmount += currentAmount;
            } else {
                System.out.printf("Cannot accept %.2f%n", currentAmount);
            }

            command = sc.nextLine();
        }

        String commandEnd = sc.nextLine();
        while (!commandEnd.equals("End")) {
            String productType = commandEnd;

            switch (productType) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    invalidProduct = true;
                    break;

            }
            if (price > totalAmount) {
                System.out.println("Sorry, not enough money");

            } else if (price <=  totalAmount && !invalidProduct) {
                System.out.printf("Purchased %s%n", productType);
                totalAmount -= price;
            }

            commandEnd = sc.nextLine();
        }

        System.out.printf("Change: %.2f", totalAmount);
    }
}
