package com.leonardovieira;

public class Dog extends Animal{
    private int eyes, legs, tail, teeth;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight,
               int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog eating");
        chew();
    }

    private void chew(){
        System.out.println("Chewing");
    }

    public void walk(int speed){
        System.out.println("Dog.walk() called");
        move(speed);
    }

    public void run(int speed){
        System.out.println("Dog.run called");
        move(speed);
    }

    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
