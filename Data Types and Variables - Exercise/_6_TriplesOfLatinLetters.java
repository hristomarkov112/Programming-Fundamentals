import javax.swing.plaf.synth.SynthUI;
import java.util.Scanner;

public class _6_TriplesOfLatinLetters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 97; i < 97 + n ; i++) {
            for (int j = 97; j < 97 + n; j++) {
                for (int k = 97; k < 97 + n ; k++) {
                    char charI = (char)i;
                    char charJ = (char)j;
                    char charK = (char)k;

                    System.out.println("" + charI + charJ + charK);
                }
            }
        }

    }
}
