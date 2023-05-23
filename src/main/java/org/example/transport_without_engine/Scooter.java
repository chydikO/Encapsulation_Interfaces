package org.example.transport_without_engine;

import org.example.Rideable;
import org.example.Transport;

public class Scooter extends Transport implements Rideable {
    private int batteryCapacity;

    public Scooter(String name, int maxSpeed, int weight, int batteryCapacity) {
        super(name, maxSpeed, weight);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " Scooter: batteryCapacity=" + batteryCapacity;
    }

    @Override
    public void ride() {
        System.out.println(toString() + " is ride");
    }
}
