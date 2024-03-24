import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _4_ListManipulationBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> numbers = Arrays.stream(sc.nextLine()
                .split(" "))
                .collect(Collectors.toList());


        String commandParts = sc.nextLine();
        while (!commandParts.equals("end")) {
            String commandName = commandParts.split(" ")[0];


            if (commandName.equals("Add")) {
                String number = commandParts.split(" ")[1];
                numbers.add(number);

            } else if (commandName.equals("Remove")) {
                String number = commandParts.split(" ")[1];

                if(numbers.contains(number)) {
                    numbers.remove(number);
                }

            } else if (commandName.equals("RemoveAt")) {
                int index = Integer.parseInt(commandParts.split(" ")[1]);
                numbers.remove(index);

            } else if (commandName.equals("Insert")) {
                String number = commandParts.split(" ")[1];
                int index = Integer.parseInt(commandParts.split(" ")[2]);

                numbers.add(index, number);
            }

            commandParts = sc.nextLine();
        }

        for (String num : numbers) {
            System.out.print(num + " ");
        }

    }
}
