import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _4_SoftUniParking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int countCommands = Integer.parseInt(sc.nextLine());

        Map<String, String> parkingData = new LinkedHashMap<>();

        for (int commands = 0; commands < countCommands ; commands++) {
            String[] commandParts = sc.nextLine().split(" ");
            String commandName = commandParts[0];


            if(commandName.equals("register")) {
                String name = commandParts[1];
                String plateNumber = commandParts[2];
                if (!parkingData.containsKey(name)) {
                    parkingData.put(name, plateNumber);
                    System.out.printf("%s registered %s successfully%n", name, plateNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", plateNumber);
                }
            } else if (commandName.equals("unregister")) {
                String name = commandParts[1];

                if (!parkingData.containsKey(name)) {
                    System.out.printf("ERROR: user %s not found%n", name);
                } else {
                    parkingData.remove(name);
                    System.out.printf("%s unregistered successfully%n", name);
                }
            }

        }

        parkingData
                .entrySet()
                .forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));

    }
}
