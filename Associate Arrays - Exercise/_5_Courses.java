import java.util.*;

public class _5_Courses {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();

        String command = sc.nextLine();
        while (!command.equals("end")) {
            String courseName = command.split(" : ")[0];
            String studentName = command.split(" : ")[1];

            if (!courses.containsKey(courseName)) {
                courses.put(courseName, new ArrayList<>());
            }

            courses.get(courseName).add(studentName);

            command = sc.nextLine();
        }

        courses
                .entrySet()
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
                });

    }
}
