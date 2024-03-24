import java.util.Scanner;

public class _7_TheatrePromotion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String typeOfDay = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());

        int price = 0;

        switch (typeOfDay) {
            case "Weekday":
                if (age < 0) {
                    System.out.println("Error!");
                } else if (age <= 18) {
                    price = 12;
                    System.out.printf("%d$", price);
                } else if (age <= 64) {
                    price = 18;
                    System.out.printf("%d$", price);
                } else if (age <= 122) {
                    price = 12;
                    System.out.printf("%d$", price);
                } else {
                    System.out.println("Error!");
                }
                break;
            case "Weekend":
                if (age < 0) {
                    System.out.println("Error!");
                } else if (age <= 18) {
                    price = 15;
                    System.out.printf("%d$", price);
                } else if (age <= 64) {
                    price = 20;
                    System.out.printf("%d$", price);
                } else if (age <= 122) {
                    price = 15;
                    System.out.printf("%d$", price);
                } else {
                    System.out.println("Error!");
                }
                break;
            case "Holiday":
                if (age < 0) {
                    System.out.println("Error!");
                } else if (age <= 18) {
                    price = 5;
                    System.out.printf("%d$", price);
                } else if (age <= 64) {
                    price = 12;
                    System.out.printf("%d$", price);
                } else if (age <= 122) {
                    price = 10;
                    System.out.printf("%d$", price);
                } else {
                    System.out.println("Error!");
                }
                break;

            default:
                System.out.println("Error!");
                break;
        }



    }
}
