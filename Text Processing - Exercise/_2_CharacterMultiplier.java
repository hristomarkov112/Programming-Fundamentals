import java.util.Scanner;

public class _2_CharacterMultiplier {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] texts = input.split(" ");

        String firstText = texts[0];
        String secondText = texts[1];

        printSumCharacters(firstText, secondText);

    }

    public static void printSumCharacters (String firstText, String secondText) {

        int maxLength = Math.max(firstText.length(), secondText.length());

        int minLength = Math.min(firstText.length(), secondText.length());

        int sum = 0;

        for (int position = 0; position <= minLength - 1; position++) {
            sum += (firstText.charAt(position) * secondText.charAt(position));
        }

        if(firstText.length() == secondText.length()) {
            System.out.println(sum);
        } else if (maxLength == firstText.length()) {
            for (int position = minLength; position <= firstText.length() - 1; position++) {
                sum += firstText.charAt(position);

            }
            System.out.println(sum);
        } else {
            for (int position = minLength; position <= secondText.length() - 1; position++) {
                sum += secondText.charAt(position);
            }
            System.out.println(sum);
        }
    }
}
