import java.util.*;
import java.util.stream.Collectors;

public class _2_ChangeList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = sc.nextLine();
        while (!command.equals("end")) {
            if (command.contains("Delete")) {
                int numberToDelete = Integer.parseInt(command.split(" ")[1]);
                numbers.removeAll(Arrays.asList(numberToDelete));
            } else if (command.contains("Insert")) {
                int insertIndex = Integer.parseInt(command.split(" ")[1]);
                int numberToInsert = Integer.parseInt(command.split(" ")[2]);
                numbers.add(numberToInsert, insertIndex);
            }

            command = sc.nextLine();
        }

        for (int num:numbers) {
            System.out.print(num + " ");
        }

    }
}
