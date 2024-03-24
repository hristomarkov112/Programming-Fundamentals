import java.util.Scanner;

public class _6_MiddleCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        printMiddleCharacter(text);
    }

    public static void printMiddleCharacter (String text) {
        if (text.length() % 2 != 0) {
            int symbol = text.length() / 2;
            char firstChar = text.charAt(symbol);
            System.out.println(firstChar);
        } else {
            int symbol1 = (text.length() / 2) - 1;
            char firstChar = text.charAt(symbol1);
            int symbol2 = text.length() / 2;
            char secondChar = text.charAt(symbol2);
            System.out.println("" + firstChar + secondChar);
        }
    }
}
