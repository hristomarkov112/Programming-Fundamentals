package _4_Students;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countStudents = Integer.parseInt(sc.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int count = 1; count <= countStudents ; count++) {
            String studentInfo = sc.nextLine();
            String firstName = studentInfo.split(" ")[0];
            String lastName = studentInfo.split(" ")[1];
            double grade = Double.parseDouble(studentInfo.split(" ")[2]);

            Student student = new Student(firstName, lastName, grade);
            studentList.add(student);
        }

        //1. сортиране по оценка (descending order)
        Collections.sort(studentList, Comparator.comparingDouble(Student::getGrade).reversed());

        //2. принтиране на списъка
        for (Student student : studentList) {
            System.out.printf("%s %s: %.2f%n", student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}