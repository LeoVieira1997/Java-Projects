package com.leonardovieira;

public class Main{

    public static void main(String[] args) {
        JaguarFPace jaguar = new JaguarFPace("F-Pace");
        System.out.println(jaguar.getModel());
        System.out.println(jaguar.isOn());
        jaguar.setOn(true);
        System.out.println(jaguar.isOn());
        jaguar.setGear(3);
        jaguar.setClutch(true);
        jaguar.setGear(3);
        System.out.println(jaguar.getGear());
    }
}
