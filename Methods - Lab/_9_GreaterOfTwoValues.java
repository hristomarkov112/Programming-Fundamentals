import java.util.Scanner;

public class _9_GreaterOfTwoValues {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();

        switch (type) {
            case "int":
                int firstNumber = Integer.parseInt(sc.nextLine());
                int secondNumber = Integer.parseInt(sc.nextLine());

                System.out.println(getMax(firstNumber, secondNumber));
                break;
            case "char":
                char firstLetter = sc.nextLine().charAt(0);
                char secondLetter = sc.nextLine().charAt(0);
                System.out.println(getMax(firstLetter, secondLetter));
                break;
            case "string":
                String firstString = sc.nextLine();
                String secondString = sc.nextLine();
                System.out.println(getMax(firstString, secondString));
                break;
        }
    }
    public static int getMax(int firstNumber, int secondNumber) {
        if(firstNumber > secondNumber) {
            return firstNumber;
        }
        return secondNumber;
    }

    public static char getMax(char firstLetter, char secondLetter) {
        if(firstLetter > secondLetter) {
            return firstLetter;
        }
        return secondLetter;
    }

    public  static String getMax(String firstString, String secondString) {
        if(firstString.compareTo(secondString) >= 0) {
            return firstString;
        }
        return secondString;
    }
}
