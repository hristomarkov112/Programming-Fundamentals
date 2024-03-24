import java.util.Scanner;

public class _5_Orders {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        int count = Integer.parseInt(sc.nextLine());
        double price = 0;

        switch (product) {
            case "coffee":
                coffee(count, price);
                break;
            case "water":
                water(count, price);
                break;
            case "coke":
                coke(count, price);
                break;
            case "snacks":
                snacks(count, price);
                break;
        }
    }

    public static void coffee(int count, double price) {
        price = 1.50;
        System.out.printf("%.2f", price * count);
    }

    public static void water(int count, double price) {
        price = 1.00;
        System.out.printf("%.2f", price * count);
    }

    public static void coke(int count, double price) {
        price = 1.40;
        System.out.printf("%.2f", price * count);
    }

    public static void snacks(int count, double price) {
        price = 2.00;
        System.out.printf("%.2f", price * count);
    }
}
