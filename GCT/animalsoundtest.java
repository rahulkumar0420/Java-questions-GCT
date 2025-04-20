abstract class Animal {
    abstract void makeSound();
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow!");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark!");
    }
}

public class animalsoundtest {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.makeSound(); // Outputs: Meow!
        dog.makeSound(); // Outputs: Bark!
    }
}
