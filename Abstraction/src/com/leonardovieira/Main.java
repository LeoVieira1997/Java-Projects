package com.leonardovieira;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Brutus");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
