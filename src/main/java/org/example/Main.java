package org.example;

import org.example.transport_with_engine.Airplane;
import org.example.transport_with_engine.Car;
import org.example.transport_without_engine.Bicycle;
import org.example.transport_without_engine.Scooter;

public class Main {
    public static void main(String[] args) {
        Transport airplane = new Airplane("Boing-747", 850, 80_000, "Kyiv-NY");
        Transport car = new Car("Mazda-626", 180, 1_800, "sedan");
        Transport bicycle = new Bicycle("Ardis", 40, 20, 19);
        Transport scooter = new Scooter("Xiomi-123", 45, 30, 18_000);


        Transport[] transports = {airplane, car, bicycle, scooter};
        for (Transport transport: transports) {
            if (transport instanceof Rideable rideable) {
                rideable.ride();
            }
            if (transport instanceof Flyable flyable) {
                flyable.fly();
            }
        }
    }
}