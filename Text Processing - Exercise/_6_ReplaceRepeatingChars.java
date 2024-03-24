import java.util.Scanner;

public class _6_ReplaceRepeatingChars {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder result = new StringBuilder(input);

        for (int position = 0; position < result.length() - 1; position++) {

            if(result.charAt(position) == result.charAt(position + 1)) {
                result.deleteCharAt(position + 1);
                position--;
            }
        }

        System.out.print(result);

    }
}
