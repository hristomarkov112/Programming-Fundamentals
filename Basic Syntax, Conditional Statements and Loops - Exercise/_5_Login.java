import java.util.Scanner;

public class _5_Login {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine();
        String correctPass = "";
        int incorrectAttempts = 0;

        for (int i = username.length() - 1; i >= 0; i--) {
            char letter = username.charAt(i);

            correctPass = correctPass + letter;

        }

        String currentPass = sc.nextLine();
        while (!currentPass.equals(correctPass)) {

            System.out.println("Incorrect password. Try again.");

            incorrectAttempts += 1;

            if (incorrectAttempts >= 3) {
                break;
            }

            currentPass = sc.nextLine();
        }

        if (currentPass.equals(correctPass)) {
            System.out.printf("User %s logged in.", username);
        } else {
            System.out.printf("User %s blocked!", username);
        }

    }
}
