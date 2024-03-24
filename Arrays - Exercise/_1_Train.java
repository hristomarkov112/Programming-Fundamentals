import javax.naming.PartialResultException;
import java.util.Arrays;
import java.util.Scanner;

public class _1_Train {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;
        String[] array = new String[n];

        for (int i = 0; i < array.length; i++) {
            int number = Integer.parseInt(sc.nextLine());
            array[i] = number + " ";
            System.out.print(array[i]);
            sum += number;
        }
        System.out.println("");
        System.out.println(sum);
    }
}
