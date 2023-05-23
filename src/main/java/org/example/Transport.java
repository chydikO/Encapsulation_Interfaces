package org.example;

public abstract class Transport {
    private String name;
    private int maxSpeed;
    private int weight;

    public Transport(String name, int maxSpeed, int weight) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Transport: name= " + name + " maxSpeed= " + maxSpeed + " weight= " + weight;
    }
}
