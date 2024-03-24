import java.util.Scanner;

public class _3_Substring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String text = sc.nextLine();

        while (true) {
            int idx = text.indexOf(word);
            if(idx == -1) {
                break;
            }

            String leftSubstr = text.substring(0, idx);
            String rightSubstr = text.substring(idx + word.length());

            text = leftSubstr + rightSubstr;
        }

        System.out.println(text);
    }
}
