package org.cars;

public class Car {
    private static final String brand = "FORD";
    private static String model;
    private final int power = 125;

    public Car(String model) {
        Car.model = model;
    }

    public static void brake() {
        System.out.println("The car is braking");
    }

    public void accelerate() {
        System.out.println("the car is accelerating");
    }
}
