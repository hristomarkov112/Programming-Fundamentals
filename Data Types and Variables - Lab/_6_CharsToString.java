import java.util.Scanner;

public class _6_CharsToString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char a = sc.nextLine().charAt(0);
        char b = sc.nextLine().charAt(0);
        char c = sc.nextLine().charAt(0);

        String result = Character.toString(a);
        String result1 = Character.toString(b);
        String result2 = Character.toString(c);

        System.out.println(result + result1 + result2);

    }
}
