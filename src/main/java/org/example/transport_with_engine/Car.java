package org.example.transport_with_engine;

import org.example.Rideable;
import org.example.Transport;

public class Car extends Transport implements Rideable {
    private String bodyType;

    public Car(String name, int maxSpeed, int weight, String bodyType) {
        super(name, maxSpeed, weight);
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return super.toString() + " Car bodyType= " + bodyType;
    }

    @Override
    public void ride() {
        System.out.println(toString() + " is ride");
    }
}
