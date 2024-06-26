import java.util.Scanner;

public class _7_StringExplosion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        StringBuilder text = new StringBuilder(input);

        int totalStrength = 0;
        for (int position = 0; position < text.length(); position++) {
            char currentSymbol = text.charAt(position);
            if(currentSymbol == '>') {
                int attackStrength = Integer.parseInt((text.charAt(position + 1) + ""));
                totalStrength += attackStrength;
            } else if (currentSymbol != '>' && totalStrength > 0) {
                text.deleteCharAt(position);
                totalStrength--;
                position--;
            }
        }

        System.out.print(text);
    }
}
