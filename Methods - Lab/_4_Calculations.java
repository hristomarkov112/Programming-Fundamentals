import java.util.Scanner;

public class _4_Calculations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        switch (command) {
            case "add":
                add(a,b);
                break;
            case "divide":
                divide(a,b);
                break;
            case "multiply":
                multiply(a,b);
                break;
            case "subtract":
                subtract(a,b);
                break;
        }
    }

    public static void add (int a, int b) {
        System.out.println(a + b);
    }

    public static void divide(int a, int b) {
        System.out.println(a / b);
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public  static void subtract(int a, int b) {
        System.out.println(a - b);
    }
}
