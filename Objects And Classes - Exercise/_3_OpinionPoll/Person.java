package _3_OpinionPoll;

public class Person {

    //описваме всеки един човек

    //полета -> характеристики(име, възраст)

    private String name;

    private  int age;

    //конструктор -> метод, чрез който създаваме обектите

    public Person (String name, int age) {
        //нов празен обект

        this.name = name;
        this.age = age;
    }

    //getters -> методи които използваме, за да достъпим променливите

    //1. getter на полето name -> стойността на полето name

    public String getName() {
        return this.name;
    }

    //2. getter на полето age -> стойността на полето age

    public int getAge() {
        return this.age;
    }
}
