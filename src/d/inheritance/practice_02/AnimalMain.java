package d.inheritance.practice_02;

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("arrrr");
    }

    public String getSpecies() {
        return "동물";
    }
}

class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("어흥!");
    }

    @Override
    public String getSpecies() {
        return "사자";
    }
}

class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("뿌우우!");
    }
    @Override
    public String getSpecies() {
        return "코끼리";
    }
}

class Monkey extends Animal {
    public Monkey(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("끼끼!");
    }
    @Override
    public String getSpecies() {
        return "원숭이";
    }
}

class Zoo {
    Animal[] animals;

    public void feedingTime(){
        System.out.println("=== 먹이 시간 ===");
        for(Animal animal : animals) {
            System.out.print(animal.getSpecies()+" "+ animal.name + ": ");
            animal.makeSound();
        }
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        Animal lion = new Lion("심바", 3);
        Animal elephant = new Elephant("덤보", 3);
        Animal monkey = new Monkey("조조", 3);

        Zoo zoo = new Zoo();
        zoo.animals = new Animal[]{lion, elephant, monkey};
        zoo.feedingTime();
    }
}
