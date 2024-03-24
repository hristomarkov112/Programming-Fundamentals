import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _2_RepeatStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split(" ");

        List<String> reoeatedWords = new ArrayList<>();

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                reoeatedWords.add(word);
            }
        }

        System.out.println(String.join("", reoeatedWords));
    }
}
