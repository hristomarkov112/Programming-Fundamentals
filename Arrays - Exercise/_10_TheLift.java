import java.util.Arrays;
import java.util.Scanner;

public class _10_TheLift {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countWaiting = Integer.parseInt(scanner.nextLine());

        int[] wagons = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean availableSpots = false;

        while (countWaiting > 0) {
            for (int index = 0; index < wagons.length; index++) {
                int availableCapacityPerWagon = 4 - wagons[index];

                if(availableCapacityPerWagon > countWaiting){
                    availableCapacityPerWagon = countWaiting;
                }

                wagons[index] = wagons[index] + availableCapacityPerWagon;
                countWaiting -= availableCapacityPerWagon;

                if (wagons[index] < 4) {
                    System.out.println("The lift has empty spots!");
                    availableSpots = true;
                    break;
                }
            }

            if (countWaiting > 0 && !availableSpots) {
                System.out.printf("There isn't enough space! %d people in a queue!%n", countWaiting);
                break;
            }
        }

        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}