package com.leonardovieira;

import java.util.Scanner;

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

//        HealthyBurguer ham = new HealthyBurguer();
//        ham.setLettuce(true);
//        ham.setChips(true);
//        ham.setCarrot(true);
//        ham.setOnion(true);
//        ham.setTomato(true);
//        ham.setDrinks(true);
//
//        System.out.println(ham.calculatePrice());
        menu();
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        System.out.println("Which type of lunch do you want? ");
        answer = scanner.nextInt();
//        if (!scanner.hasNextInt()){
//            System.out.println("Invalid value, please try again!");
//            scanner.nextLine();
//            answer = scanner.nextInt();
//        }
        switch (answer){
            case 1:
                BaseHamburger base = new BaseHamburger();
                base.order();
                base.calculatePrice();
                break;
            case 2:
                HealthyBurguer healthy = new HealthyBurguer();
                healthy.order();
                healthy.calculatePrice();
                break;
            case 3:
                DeluxeHamburger deluxe = new DeluxeHamburger();
                deluxe.calculatePrice();
                break;
            default:
                BaseHamburger basic = new BaseHamburger();
                basic.order();
                basic.calculatePrice();
                break;
        }
        scanner.close();
    }
    private static void menu() {
        System.out.println(" 1 - Bill's Hamburguer: " + "\n" +
                " Bread roll type, meat and up to 4 additionals..................$2.50 ");
        System.out.println(" 2 - Healthy Hamburguer: " + "\n" +
                " Brown rye roll bread and up to 6 additionals...................$1.25 ");
        System.out.println(" 3 - Deluxe Hamburguer: " + "\n" +
                " Deluxe bread, meat, chips and drinks...........................$5.00 ");
        System.out.println("\n" + " --------------- Additionals --------------------" + "\n");
        System.out.println(" 1 - Meat: $1.25");
        System.out.println(" 2 - Tomato: $0.50");
        System.out.println(" 3 - Lettuce: $0.30");
        System.out.println(" 4 - Carrot: $0.25");
        System.out.println(" 5 - Onion: $0.35");
        System.out.println(" 6 - Chips: $1.00");
        System.out.println(" 7 - Drinks: $1.25");
    }
}