package org.example.transport_without_engine;

import org.example.Rideable;
import org.example.Transport;

public class Bicycle extends Transport implements Rideable {
    private int frameSize;

    public Bicycle(String name, int maxSpeed, int weight, int frameSize) {
        super(name, maxSpeed, weight);
        this.frameSize = frameSize;
    }

    public int getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(int frameSize) {
        this.frameSize = frameSize;
    }

    @Override
    public String toString() {
        return super.toString() + " Bicycle: frameSize= " + frameSize;
    }

    @Override
    public void ride() {
        System.out.println(toString() + " is ride");
    }
}
