import javax.print.attribute.standard.PresentationDirection;
import java.util.Scanner;

public class _7_RepeatingString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int repeatTimes = Integer.parseInt(sc.nextLine());

        calculateRepeat(word, repeatTimes);
    }

    public static String calculateRepeat(String word, int repeatTimes) {
        String result = "";

        for (int i = 0; i < repeatTimes; i++) {
            System.out.print(word);
        }
        return result;
    }
}
