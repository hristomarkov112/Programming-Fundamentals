import java.util.Scanner;

public class _7_ReversedChars {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char a = sc.nextLine().charAt(0);
        char b = sc.nextLine().charAt(0);
        char c = sc.nextLine().charAt(0);

        String stringA = Character.toString(a);
        String stringB = Character.toString(b);
        String stringC = Character.toString(c);

        String result = String.format(stringC + " " + stringB + " " + stringA);

        System.out.println(result);
    }
}
