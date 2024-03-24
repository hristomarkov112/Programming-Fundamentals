import java.util.Arrays;
import java.util.Scanner;

public class _4_TextFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] bannedWords = sc.nextLine().split(", ");
        String text = sc.nextLine();

        for (String word : bannedWords) {
            String replacement = genReplacement(word);
            text = text.replace(word, replacement);
        }

        System.out.println(text);
    }

    private static String genReplacement(String word) {
        char[] replacementCharArr = new char[word.length()];

        Arrays.fill(replacementCharArr, '*');

        return  new String(replacementCharArr);
    }
}
