import java.util.Scanner;

public class _4_PasswordValidator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String password= sc.nextLine();

        boolean areOnlyDigitsAndNumbers = passwordOnlyDigitsAndNumbers(password);
        boolean isBetween6and10Symbols = passwordCharacters(password);
        boolean areDigitsMoreThan2 = passwordDigitsCount(password);

        if (areOnlyDigitsAndNumbers && isBetween6and10Symbols && areDigitsMoreThan2) {
            System.out.println("Password is valid");
        }

        if (!areOnlyDigitsAndNumbers) {
            System.out.println("Password must consist only of letters and digits");
        }

        if (!isBetween6and10Symbols) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!areDigitsMoreThan2) {
            System.out.println("Password must have at least 2 digits");
        }
    }

    public static boolean passwordCharacters(String password) {
        if (password.length() < 6 || password.length() > 10) {
            return false;
        }
        return true;
    }

    public static boolean passwordDigitsCount(String password) {
        int countNumbers = 0;

        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            switch (symbol) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    countNumbers++;
                    break;
            }
        }
        if (countNumbers < 2) {
            return false;
        }
        return true;
    }

    public static boolean passwordOnlyDigitsAndNumbers(String password) {
        int countNumbers = 0;

        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);

            int symbolIntValue = (int)symbol;
            if (symbolIntValue < 48) {
                return false;
            } else if (symbolIntValue > 57 && symbolIntValue < 65) {
                return false;
            } else if (symbolIntValue > 90 && symbolIntValue < 97) {
                return false;
            } else if (symbolIntValue > 122) {
                return false;
            }
        }
        return true;
    }
}
