import java.util.Arrays;
import java.util.Scanner;

public class _4_WordFilter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = Arrays.stream(sc.nextLine()
                .split(" "))
                .filter(word -> word.length() % 2 == 0)
                .toArray(String[]::new);

        for (String word: words) {
            System.out.println(word);
        }
    }
}
