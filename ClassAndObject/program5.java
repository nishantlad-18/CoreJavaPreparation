package CoreJavaPreparation.ClassAndObject;

class Car {

    String brand;
    String model;
    double price;
    int speed;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Speed: " + speed);
    }

    void increaseSpeed(int value) {
        speed = speed + value;
    }

    void decreaseSpeed(int value) {
        speed = speed - value;
    }

    public static void main(String[] args) {

        Car c1 = new Car();

        c1.brand = "Toyota";
        c1.model = "Fortuner";
        c1.price = 3500000;
        c1.speed = 60;

        c1.displayDetails();

        c1.increaseSpeed(20);
        System.out.println("After Increase: " + c1.speed);

        c1.decreaseSpeed(10);
        System.out.println("After Decrease: " + c1.speed);
    }
}