package com.federicotoluzzo.classi.es7;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Car car = new Car();

        bike.drive();
        car.drive(6.9f);
    }
}
