package org.cars;

public class App {
    public static void main(String[] args) {
        Car car1 = new Car("Focus");
        Car.brake();
        car1.accelerate();
    }
}
