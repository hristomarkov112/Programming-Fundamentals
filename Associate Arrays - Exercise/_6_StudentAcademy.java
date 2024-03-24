
import java.util.*;

public class _6_StudentAcademy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int countStudents = Integer.parseInt(sc.nextLine());

        Map<String, List<Double>> studentGrades = new LinkedHashMap<>();

        for (int count = 0; count < countStudents; count++) {
            String studentName = sc.nextLine();
            double grade = Double.parseDouble(sc.nextLine());

            if(!studentGrades.containsKey(studentName)) {
                studentGrades.put(studentName, new ArrayList<>());
            }

            studentGrades.get(studentName).add(grade);
        }

        Map<String, Double> studentAverageGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()) {
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();
            double averageGrade = getAverageGrade(grades);
            if(averageGrade >= 4.50) {
                studentAverageGrade.put(studentName, averageGrade);
            }
        }

        studentAverageGrade.entrySet()
                .forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));

    }

    private static double getAverageGrade (List<Double> grades) {
        double sumGrades = 0;
        for (double grade : grades) {
            sumGrades += grade;
        }
        return  sumGrades / grades.size();

    }
}
