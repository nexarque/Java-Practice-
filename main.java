class Car {
    String color;
    String brand;

    void displayDetails() {
        System.out.println("Brand : "+brand);
        System.out.println("Color : "+color);
    }
}

public class main {
    public static void main(String args[]) {

        Car car1 = new Car();
        car1.brand = "Nissan Skyline GTR R34";
        car1.color = "Blue and Frost white";

        Car car2 = new Car();
        car2.brand = "Mazda Rx-7";
        car2.color = "Tango Red ";

        car1.displayDetails();
        car2.displayDetails();

    }
}