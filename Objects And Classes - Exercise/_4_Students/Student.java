package _4_Students;

public class Student {

    private String firstName;
    private String lastName;
    private double grade;

    //конструктор
    public Student(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    //методи -> действия

    //1. getter за полето grade - достъп до стойността grade
    public double getGrade() {
        return this.grade;
    }

    //2. getter за полето firstName - достъп до стойността
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
