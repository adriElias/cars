package org.cars;

public class Car {
    private static final String brand = "FORD";
    private static String model;
    private final int power = 125;

    public Car(String model){
        Car.model = model;
    }
}
