package com.leonardovieira;

public class Main {

    public static void main(String[] args) {
//	    Printer printer = new Printer();
//
//	    printer.printPage(5, true);
//        System.out.println(printer.getTonerLevel());
//        printer.fillToner(5);
//        System.out.println(printer.getTonerLevel());
//        printer.fillToner(20);

//        Peugeot peugeot = new Peugeot(6, 4,"white","208");
//        peugeot.accelerate();
//        peugeot.brake();
//        Ford ford = new Ford(6, 4,"Red","Ecosport");
//        ford.accelerate();
//        ford.brake();
        HealthyBurguer ham = new HealthyBurguer(1,1);
        ham.setCarrot(1);
        ham.setLettuce(1);
        ham.setOnion(1);
        ham.setTomato(1);
        ham.setEgg(1);


        System.out.println(ham.calculatePrice());

    }
}
