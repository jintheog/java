package d.inheritance;

abstract class Animal5 {
    abstract void run();
    abstract void sleep();
    abstract void eat();
}

class Dog5 extends Animal5 {
    void run() {
    }

    void sleep() {}

    void eat() {}
}

interface Animal6 {
    //인터페이스의 목적은 모든 메서드를 추상 메서드로 만드는것이기 때문에 일반 메서드를 생성 할 수 없다
    //void sound(){};
    void run();
    void sleep();
    void eat();
}
class Dog6 implements Animal6{
    @Override
    public void run() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat() {

    }
}

public class InterfaceMain {
}
