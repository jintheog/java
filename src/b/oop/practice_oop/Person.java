package b.oop.practice_oop;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("이름: "+this.name+", 나이: "+age);
    }
}
