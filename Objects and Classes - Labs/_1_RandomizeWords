import java.util.*;
import java.util.stream.Collectors;

public class _1_RandomizeWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> inputWords = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());

        Random rnd = new Random();

        int inputWordsLen = inputWords.size();
        for (int i = 0; i < inputWordsLen; i++) {
            int idx = rnd.nextInt(inputWords.size());

            System.out.println(inputWords.get(idx));
            inputWords.remove(idx);
        }
    }
}
