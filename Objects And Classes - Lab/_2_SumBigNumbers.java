import java.math.BigInteger;
import java.util.Scanner;

public class _2_SumBigNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());

        BigInteger result = a.add(b);

        System.out.println(result);
    }
}
