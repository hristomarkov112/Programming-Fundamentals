import java.util.Scanner;

public class _4_ReverseTheString {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0 ; i -= 1) {
            char letter = word.charAt(i);

            reversedWord = reversedWord + letter;
        }

        System.out.println(reversedWord);
    }
}
