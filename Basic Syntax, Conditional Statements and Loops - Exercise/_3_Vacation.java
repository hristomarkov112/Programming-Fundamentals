import java.util.Scanner;

public class _3_Vacation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(sc.nextLine());
        String ticketType = sc.nextLine();
        String day = sc.nextLine();

        double price = 0;
        double total = 0;

        switch (day) {
            case "Friday":
                switch (ticketType) {
                    case "Students":
                    price = 8.45;
                        if (count >= 30) {
                            price -= price * 0.15;
                        }
                        break;
                    case "Business":
                        price = 10.90;
                        break;
                    case "Regular":
                        price = 15.00;
                        if (count > 10 && count <= 20) {
                            price -= price * 0.05;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (ticketType) {
                    case "Students":
                        price = 9.80;
                        if (count >= 30) {
                            price -= price * 0.15;
                        }
                        break;
                    case "Business":
                        price = 15.60;
                        break;
                    case "Regular":
                        price = 20.00;
                        if (count > 10 && count <= 20) {
                            price -= price * 0.05;
                        }
                        break;
                }
                break;
            case "Sunday":
                switch (ticketType) {
                    case "Students":
                        price = 10.46;
                        if (count >= 30) {
                            price -= price * 0.15;
                        }
                        break;
                    case "Business":
                        price = 16.00;
                        break;
                    case "Regular":
                        price = 22.50;
                        if (count > 10 && count <= 20) {
                            price -= price * 0.05;
                        }
                        break;
                }
                break;
        }

        total = price * count;

        if (count >= 100 && ticketType.equals("Business")) {
            total -= 10 * price;
        }


        System.out.printf("Total price: %.2f", total);

    }
}
