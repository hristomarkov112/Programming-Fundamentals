import java.util.Scanner;

public class _3_CharactersinRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char firstSymbol = sc.nextLine().charAt(0);
        char secondSymbol = sc.nextLine().charAt(0);

        printCharacters(firstSymbol, secondSymbol);
    }

    public static void printCharacters(char firstSymbol, char secondSymbol) {
        if (firstSymbol < secondSymbol) {
            for (char i = (char) (firstSymbol + 1); i < secondSymbol; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (char i = (char) (secondSymbol + 1); i < firstSymbol; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
