import java.util.Scanner;

public class _4_BackIn30Minutes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hours = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());

        minutes+= 30;

        if (minutes > 59) {
            hours += 1;
            minutes -= 60;
        }

        if (hours > 23) {
            hours -= 24;
        }

        System.out.printf("%d:%02d", hours, minutes);

    }
}
