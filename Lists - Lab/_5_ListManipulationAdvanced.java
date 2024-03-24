import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _5_ListManipulationAdvanced {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine()
                .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        String commandParts = sc.nextLine();
        while (!commandParts.equals("end")) {
            String commandName = commandParts.split(" ")[0];

            if (commandName.equals("Contains")) {
            int number = Integer.parseInt(commandParts.split(" ")[1]);

            if (numbers.contains(number)) {
                System.out.println("Yes");
            } else {
                System.out.println("No such number");
            }

            } else if (commandName.equals("Print")) {
            String evenOrOdd = commandParts.split(" ")[1];
                if (evenOrOdd.equals("even")) {
                    for (int i = 0; i < numbers.size(); i++) {
                        int currentNumber = numbers.get(i);
                        if(currentNumber % 2 == 0) {
                            System.out.print(currentNumber + " ");
                        }
                    }
                    System.out.println();
                } else if (evenOrOdd.equals("odd")) {
                    for (int i = 0; i < numbers.size(); i++) {
                        int currentNumber = numbers.get(i);
                        if(currentNumber % 2 != 0) {
                            System.out.print(currentNumber + " ");
                        }
                    }
                    System.out.println();
                }

            } else if (commandName.equals("Get")) {

                int sum = 0;
                for (int i = 0; i < numbers.size(); i++) {
                    int currentNumber = numbers.get(i);
                    sum += currentNumber;
                }

                System.out.println(sum);

            } else if (commandName.equals("Filter")) {
                String limit = commandParts.split(" ")[1];
                int number = Integer.parseInt(commandParts.split(" ")[2]);

                switch (limit) {
                    case "<":
                        for (int i = 0; i < numbers.size(); i++) {
                            int currentNumber = numbers.get(i);
                            if (currentNumber < number) {
                                System.out.print(currentNumber + " ");
                            }
                        }
                        System.out.println();
                        break;
                    case ">":
                        for (int i = 0; i < numbers.size(); i++) {
                            int currentNumber = numbers.get(i);
                            if (currentNumber > number) {
                                System.out.print(currentNumber + " ");
                            }
                        }
                        System.out.println();
                        break;
                    case ">=":
                        for (int i = 0; i < numbers.size(); i++) {
                            int currentNumber = numbers.get(i);
                            if (currentNumber >= number) {
                                System.out.print(currentNumber + " ");
                            }
                        }
                        System.out.println();
                        break;
                    case "<=":
                        for (int i = 0; i < numbers.size(); i++) {
                            int currentNumber = numbers.get(i);
                            if (currentNumber <= number) {
                                System.out.print(currentNumber + " ");
                            }
                        }
                        System.out.println();
                        break;
                }
            }

            commandParts = sc.nextLine();
        }
    }
}
