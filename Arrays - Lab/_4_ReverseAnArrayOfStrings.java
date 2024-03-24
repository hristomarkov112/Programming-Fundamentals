import java.util.Arrays;
import java.util.Scanner;

public class _4_ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] elements = sc.nextLine().split(" ");
        String[] reversed = new String[elements.length];

        int reversedIdx = 0;
        for (int i = elements.length - 1; i >= 0 ; i--) {
            reversed[reversedIdx] = elements [i];
            reversedIdx += 1;
        }

        System.out.println(String.join(" ", reversed));
    }
}
