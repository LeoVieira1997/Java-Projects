package com.leonardovieira;

public class Car {
    private int cylinders, wheels, doors;
    private boolean engine;
    private String color, model;

    public Car(int cylinders, int doors, String color, String model) {
        this.cylinders = cylinders;
        this.doors = doors;
        this.color = color;
        this.model = model;
        engine = true;
        wheels = 4;
    }

    public void startEngine(){
        System.out.println("Engine running");
    }

    public void accelerate(){
        System.out.println("Car is accelerating");
    }

    public void brake(){
        System.out.println("Car is breaking");
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}

class Jaguar extends Car{

    public Jaguar(int cylinders, int doors, String color, String model){
        super(cylinders, doors, color, model);
    }

    @Override
    public void startEngine() {
        System.out.println(getModel() + " engine running");
    }

    @Override
    public void accelerate() {
        System.out.println(getModel() + " is accelerating");
    }

    @Override
    public void brake() {
        System.out.println(getModel() + " is breaking");
    }
}

class Peugeot extends Car{
    public Peugeot(int cylinders, int doors, String color, String model) {
        super(cylinders, doors, color, model);
    }

    @Override
    public void startEngine() {
        System.out.println(getModel() + " engine is running");
    }

    @Override
    public void accelerate() {
        System.out.println(getModel() + " is accelerating");
    }

    @Override
    public void brake() {
        System.out.println(getModel() + " is breaking");
    }
}

class Ford extends Car{
    public Ford(int cylinders, int doors, String color, String model) {
        super(cylinders, doors, color, model);
    }

    @Override
    public void startEngine() {
        System.out.println(getModel() + " engine is running");
    }

    @Override
    public void brake() {
        System.out.println(getModel() + " is breaking");
    }
}

