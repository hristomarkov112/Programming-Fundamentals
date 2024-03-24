import java.util.Scanner;

public class _6_StrongNumber {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       int number = Integer.parseInt(sc.nextLine());
       int sumFact = 0;
       int startNumber = number;

       while (number > 0) {
           int lastDigit = number % 10;

           int fact = 1;

           for (int i = 1; i <= lastDigit ; i++) {
               fact = fact * i;
           }

           sumFact += fact;

           number = number / 10;
       }

       if (startNumber == sumFact) {
            System.out.println("yes");
       } else {
            System.out.println("no");
       }

    }
}
