package d.inheritance.practice_01;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("이름: "+ name + ", 나이: " + age);
    }
}

class Student extends Person {
    String studentId;
    String major;

    public Student(String name, int age, String studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }

    @Override
    void introduce() {
        System.out.printf("안녕하세요, 저는 %s 입니다. %d살이고, 학번은 %s이며, %s 전공 입니다.",name,age,studentId,major);
    }
}

public class PersonMain {
    public static void main(String[] args) {
        Person p = new Person("쿠냐", 22);
        Student s = new Student("도쿠", 20, "6543", "체육");
        p.introduce();
        s.introduce();

    }
}
