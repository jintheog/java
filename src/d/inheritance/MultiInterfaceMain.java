package d.inheritance;
class Animal7 {
    public void eat() {
        System.out.println("먹는다");
    }
}
interface Swimmable {
    void swim();

}

interface Flyable {
    void fly();
}

interface Walkable {
    void walk();
}

class Duck implements Swimmable, Flyable, Walkable {
    @Override
    public void swim() {
        System.out.println("오리가 수영하다");
    }
    @Override
    public void fly() {
        System.out.println("오리가 날다");
    }
    @Override
    public void walk() {
        System.out.println("오리가 걷다");
    }

}
class Fish extends Animal7 implements Swimmable{
    @Override
    public void swim() {
        System.out.println("물고기가 수영하다");
    }
}



public class MultiInterfaceMain {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Fish fish = new Fish();

        duck.fly();
        duck.swim();
        duck.walk();
        fish.swim();

    }
}
