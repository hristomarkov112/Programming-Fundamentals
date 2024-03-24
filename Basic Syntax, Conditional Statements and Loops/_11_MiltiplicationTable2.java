import java.util.Scanner;

public class _11_MiltiplicationTable2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int times = Integer.parseInt(sc.nextLine());

        do {
            System.out.printf("%d X %d = %d%n", n, times, n * times);
            times += 1;
        }
        while (times <= 10);

    }
}
