import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _1_CountCharsInAString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()) {
            if(symbol == ' ') {
                continue;
            }

            if(!symbolsCount.containsKey(symbol)) {
                symbolsCount.put(symbol, 1);
            } else {
                int currentCount = symbolsCount.get(symbol);
                symbolsCount.put(symbol, currentCount + 1);
            }
        }
        
        for(Map.Entry<Character, Integer> entry : symbolsCount.entrySet()) {
               System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
