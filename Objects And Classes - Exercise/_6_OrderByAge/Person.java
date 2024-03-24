package _6_OrderByAge;

public class Person {
    private String name;
    private String id;
    private int age;

    //constructor
    public Person(String name, String id, int age) {
        //нов празен обект
        this.name = name;
        this.id = id;
        this.age = age;
    }

    //getters
    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public int getAge() {
        return this.age;
    }
}
