import java.util.Scanner;

public class _5_ConcatNames {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String delimiter = sc.nextLine();

        String result = String.format(firstName + delimiter + lastName);

        System.out.println(result);

    }
}
