import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _3_Orders {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> productsQuantity = new LinkedHashMap<>();
        Map<String, Double> productsPrice = new LinkedHashMap<>();

        String commandParts = sc.nextLine();
        while (!commandParts.equals("buy")) {
            String productType = commandParts.split(" ")[0];
            double price = Double.parseDouble(commandParts.split(" ")[1]);
            int quantity = Integer.parseInt(commandParts.split(" ")[2]);

            if (!productsQuantity.containsKey(productType)) {
                productsQuantity.put(productType, quantity);
            } else {
                int currentQuantity = productsQuantity.get(productType);
                productsQuantity.put(productType, currentQuantity + quantity);
            }

            productsPrice.put(productType, price);

            commandParts = sc.nextLine();
        }

        for (Map.Entry<String, Integer> entry : productsQuantity.entrySet()) {
            String productName = entry.getKey();
            double finalPrice = productsQuantity.get(productName) * productsPrice.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalPrice);
        }
    }
}
