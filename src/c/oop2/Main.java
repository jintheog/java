package c.oop2;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int result = calc.add(2, 3);
        int result2 = calc.add(4, 5, 6);

        System.out.println(result);
        System.out.println(result2);

        Person person = new Person();
        Person person2 = new Person("John", 18);
        Person person3 = new Person("Lee", 30, "Seoul");


        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10);
        Rectangle r3 = new Rectangle(20, 30);

    }
}
