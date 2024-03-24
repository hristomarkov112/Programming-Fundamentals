import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1_ReverseStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String word = sc.nextLine();
            if(word.equals("end")) {
                break;
            }
            String reversedWord = reverseWord(word);

            System.out.printf("%s = %s%n", word, reversedWord);
        }
    }

    private static String reverseWord(String word) {
        char[] reversedResult = new char[word.length()];

        int reversedResultIdx = 0;

        for (int i = word.length() - 1; i >= 0; i--) {
            char currentChar = word.charAt(i);
            reversedResult[reversedResultIdx] = currentChar;
            reversedResultIdx += 1;
        }

        return new String(reversedResult);
    }
}
