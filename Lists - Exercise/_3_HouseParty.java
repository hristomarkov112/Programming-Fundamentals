import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _3_HouseParty {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(sc.nextLine());

        List<String> names = new ArrayList<>();

        for (int inputCounts = 0; inputCounts < numberOfCommands; inputCounts++) {
            String[] command = sc.nextLine().split(" ");
            String name = command[0];
            String status = command[2];

            switch (status) {
                case "going!":
                    if (!names.contains(name)) {
                        names.add(name);
                    } else {
                        System.out.printf("%s is already in the list!%n", name);
                    }
                    break;

                case "not":
                    if (names.contains(name)) {
                        names.remove(name);
                    } else {
                        System.out.printf("%s is not in the list!%n", name);
                    }
                    break;
            }
        }
        for (String finalNames : names) {
            System.out.println(finalNames);
        }
    }
}
