import java.util.Scanner;

public class _1_DayOfWeek {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int day = Integer.parseInt(sc.nextLine());

        String[] days = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
        };

        if (day >= 1 && day <= days.length) {
            System.out.println(days[day - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
