import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map;

public class _2_AMinerTask {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> miners = new LinkedHashMap<>();

        String command = sc.nextLine();
        while (!command.equals("stop")) {
            String resource = command;
            int quantity = Integer.parseInt(sc.nextLine());

            if(!miners.containsKey(resource)) {
                miners.put(resource, quantity);
            } else {
                int currentCount = miners.get(resource);
                miners.put(resource, currentCount + quantity);
            }

            command = sc.nextLine();
        }

        miners
                .entrySet()
                .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
