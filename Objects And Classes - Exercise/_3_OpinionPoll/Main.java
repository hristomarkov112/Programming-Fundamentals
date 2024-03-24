package _3_OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Person> peopleList = new ArrayList<>();

        for (int row = 1; row <= n; row++) {
            String personalData = sc.nextLine();
            String name = personalData.split(" ")[0];
            int age = Integer.parseInt(personalData.split(" ")[1]);

            if(age > 30) {
                Person person = new Person(name, age);
                peopleList.add(person);
            }
        }

        //списък с хората над 30 години
        //всеки човек -> отпечатваме
        for (Person person : peopleList) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}