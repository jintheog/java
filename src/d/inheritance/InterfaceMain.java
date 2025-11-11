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
        System.out.println("Dog run");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleep");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }
}

interface Drawable {
    void draw();
}

class Rectangle6 implements Drawable {
    private int width;
    private int height;

    public Rectangle6(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("사각형 그리기");
    }
}





public class InterfaceMain {
    public static void main(String[] args) {
        Animal6 d = new Dog6();
        d.run();
        d.sleep();
        d.eat();
    }
}
