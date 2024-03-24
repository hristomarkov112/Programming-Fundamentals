import java.util.Scanner;

public class _3_Elevator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int countPeople = Integer.parseInt(sc.nextLine());
        int capacity = Integer.parseInt(sc.nextLine());

        double countCourses = Math.ceil(1.0 * countPeople / capacity);

        System.out.printf("%.0f",countCourses);



    }

}
