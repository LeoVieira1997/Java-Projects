package com.leonardovieira;

public class Fish extends Animal{
    private int gills, eyes, fins;

    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

    private void moveMuscles(){

    }

    private void moveBackFin(){

    }
}
