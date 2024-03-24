import java.util.Scanner;

public class _2_VowelsCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();

        countVowels(text);
    }

    public static void countVowels(String text) {
        int totalVowels = 0;

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            switch (letter) {
                case 'a':
                case 'e':
                case 'o':
                case 'u':
                case 'i':
                    totalVowels++;
                    break;
            }
        }

        System.out.println(totalVowels);
    }
}
