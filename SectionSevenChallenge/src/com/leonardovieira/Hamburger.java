package com.leonardovieira;

public class Hamburger {
    private int bread, meat;
    private int tomato, lettuce, carrot, onion;

    public Hamburger(int bread, int meat) {
        this.bread = bread;
        this.meat = meat;
        printMenu();
    }

    public double calculatePrice(){
        double totalPrice = 0;
        switch(getBread()){
            case 1:
                totalPrice += 1.25;
                break;
            case 2:
                totalPrice += 1.75;
                break;
            case 3:
                totalPrice += 2.00;
                break;
            default:
                totalPrice += 1.25;
                break;
        }
        switch(getMeat()){
            case 1:
                totalPrice += 1.25;
                break;
            case 2:
                totalPrice += 1.75;
                break;
            case 3:
                totalPrice += 2.00;
                break;
            default:
                totalPrice += 1.25;
                break;
        }
        totalPrice += ((0.50 * getTomato()) + (0.30 * getLettuce()) + (0.25 * getCarrot()) + (0.35 * getOnion()));
        return totalPrice;
    }

    public void printMenu(){
        System.out.println(" Bill's Hamburguer: $2.50 + additionals ");
        System.out.println(" Healthy Hamburguer: $3.00 + additionals ");
        System.out.println(" Deluxe Hamburguer: $8.00 with chips and drinks ");
        System.out.println(" --------------- Additionals --------------------");
        System.out.println(" Tomato: $0.50");
        System.out.println(" Lettuce: $0.30");
        System.out.println(" Carrot: $0.25");
        System.out.println(" Onion: $0.35");
    }

    public int getBread() {
        return bread;
    }

    public int getTomato() {
        return tomato;
    }

    public int getLettuce() {
        return lettuce;
    }

    public int getCarrot() {
        return carrot;
    }

    public int getOnion() {
        return onion;
    }

    public int getMeat() {
        return meat;
    }

    //    public void setTomato(int tomato, int order) {
//        if ((getCarrot() + getLettuce() + getOnion() + getTomato()) >= order){
//            System.out.println("You already selected all additionals");
//        } else {
//            this.tomato = tomato;
//        }
//    }
//
//    public void setLettuce(int lettuce, int order) {
//        if ((getCarrot() + getLettuce() + getOnion() + getTomato()) >= order){
//            System.out.println("You already selected all additionals");
//        } else {
//            this.lettuce = lettuce;
//        }
//    }
//
//    public void setCarrot(int carrot, int order) {
//        if ((getCarrot() + getLettuce() + getOnion() + getTomato()) >= order){
//            System.out.println("You already selected all additionals");
//        } else {
//            this.carrot = carrot;
//        }
//    }
//
//    public void setOnion(int onion, int order) {
//        if ((getCarrot() + getLettuce() + getOnion() + getTomato()) >= order){
//            System.out.println("You already selected all additionals");
//        } else {
//            this.onion = onion;
//        }
//    }
}
