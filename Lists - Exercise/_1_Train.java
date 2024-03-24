
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _1_Train {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(sc.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(sc.nextLine());

        String command = sc.nextLine();
        while (!command.equals("end")) {
            if (command.contains("Add")) {
                int count = Integer.parseInt(command.split(" ")[1]);
                wagons.add(count);
            } else {
                int passangersCount = Integer.parseInt(command);
                for (int wagon = 0; wagon <= wagons.size() - 1; wagon++) {
                    int passangersPerWagon = wagons.get(wagon);

                    if (passangersPerWagon + passangersCount <= maxCapacity) {
                        wagons.set(wagon, passangersCount + passangersPerWagon);
                        break;
                    }
                }
            }
            command = sc.nextLine();
        }

        for (int wagon:wagons) {
            System.out.print(wagon + " ");
        }
    }
}
