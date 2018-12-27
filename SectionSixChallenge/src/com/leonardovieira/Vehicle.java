package com.leonardovieira;

public class Vehicle {
    private double speed;
    private String model;

    public Vehicle(String model) {
        this.speed = 0.0;
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
