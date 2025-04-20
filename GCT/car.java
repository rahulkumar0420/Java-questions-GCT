class Car {
    String brand;
    String model;

    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla");
        myCar.display();
    }
}
