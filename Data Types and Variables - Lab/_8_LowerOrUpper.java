import java.util.Scanner;

public class _8_LowerOrUpper {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char a = sc.nextLine().charAt(0);

        int asciiValue = a;

        if (asciiValue <= 90) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
