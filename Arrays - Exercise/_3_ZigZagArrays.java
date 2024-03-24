import java.util.Scanner;

public class _3_ZigZagArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String firstOutput = "";
        String secondOutput = "";

        for (int row = 1; row <= n ; row++) {
            String [] firstArray = sc.nextLine().split(" ");

            if(row % 2 == 0) {
                secondOutput += firstArray[1] + " ";
                firstOutput += firstArray[0] + " ";
            } else {
                firstOutput += firstArray[1] + " ";
                secondOutput += firstArray[0] + " ";
            }
        }
        System.out.println(secondOutput);
        System.out.println(firstOutput);
    }
}
