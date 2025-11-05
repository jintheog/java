package b.oop.practice_oop;

public class Practice {
    public static void main(String[] args) {
        //Practice_1
        Person person = new Person("홍길동", 25);
        person.printInfo();

        System.out.println("=====================================");

        //Practice_2
        Dog dog = new Dog("진돗개", "백구");
        dog.sit();
        dog.hand();

        System.out.println("=====================================");

        //Practice_3
        Car car = new Car("Avante", 0);
        car.accelerate();  // 속도 10
        car.accelerate();  // 속도 20
        car.accelerate();  // 속도 30
        car.brake();       // 속도 20
        car.printInfo();   // 모델: Avante, 속도: 20km/h

        System.out.println("=====================================");

        //Practice_4
        BankAccount accnt = new BankAccount("123123123", 0);
        accnt.deposit(10000);
        accnt.withdraw(3000);

        System.out.println("=====================================");

        //Practice_5
        Counter cntr = new Counter(0);
        cntr.increment();
        cntr.increment();
        cntr.decrement();
        System.out.println(cntr.getCount());
        cntr.reset();
        System.out.println(cntr.getCount());
    }
}
