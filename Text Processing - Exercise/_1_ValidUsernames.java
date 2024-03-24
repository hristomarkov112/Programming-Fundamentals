import java.util.Scanner;

public class _1_ValidUsernames {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] usernames = sc.nextLine()
                .split(", ");

        for (String username : usernames) {
            if (isValidUsername(username)) {
                System.out.println(username);
            }
        }
    }

    public static boolean isValidUsername(String username) {
        if (username.length() < 3 || username.length() > 16) {
            return false;
        }


        for (char symbol : username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }

        return true;
    }
}
