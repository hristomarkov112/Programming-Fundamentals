import java.util.Scanner;

public class _4_CeasarCipher {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        StringBuilder encryptedText = new StringBuilder();

        for (char symbol : text.toCharArray()) {
            char encryptSymbol = (char) (symbol + 3);
            encryptedText.append(encryptSymbol);
            System.out.print(encryptSymbol);
        }
    }
}
