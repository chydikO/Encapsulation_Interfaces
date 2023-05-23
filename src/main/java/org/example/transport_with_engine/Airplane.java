package org.example.transport_with_engine;

import org.example.Flyable;
import org.example.Transport;

public class Airplane extends Transport implements Flyable {
    private String flight;

    public Airplane(String name, int maxSpeed, int weight, String flight) {
        super(name, maxSpeed, weight);
        this.flight = flight;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return super.toString() + "Airplane: flight= " + flight;
    }

    @Override
    public void fly() {
        System.out.println(toString() + " is flying");
    }
}
