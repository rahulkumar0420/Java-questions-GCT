class animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends animal {
    @Override
    void makeSound() {
        System.out.println("Bark!");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Outputs "Bark!"
    }
}
