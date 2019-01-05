package com.leonardovieira;
import java.util.Scanner;
public class Hamburger {
    private int bread, additionals;
    private boolean meat, tomato, lettuce, carrot, onion, chips, drinks;

    public Hamburger(int bread,int additionals) {
        this.bread = bread;
        this.additionals = additionals;
    }

    public void order(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------ Additionals ---------------------");
        for (int i = 0; i < additionals; i++){
            System.out.println("Type a additional:");
            if (scanner.hasNextInt()){
                int answer = scanner.nextInt();
                switch (answer){
                    case 1:
                        meat = true;
                        break;
                    case 2:
                        tomato = true;
                        break;
                    case 3:
                        lettuce = true;
                        break;
                    case 4:
                        carrot = true;
                        break;
                    case 5:
                        onion = true;
                        break;
                    case 6:
                        chips = true;
                        break;
                    case 7:
                        drinks = true;
                }
            }
        }
    }

    public void calculatePrice(){
        double totalPrice = 0;
        String order = "";
        int add = 0;
        while (add <= additionals) {
            switch (bread) {
                case 1:
                    totalPrice += 1.25;
                    order = "Bill's Burger";
                    break;
                case 2:
                    totalPrice += 1.50;
                    order = "Healthy Burger";
                    break;
                case 3:
                    totalPrice += 1.50;
                    order = "Deluxe Burger";
                    break;
                default:
                    totalPrice += 1.25;
                    order = "Bill's Burger";
                    break;
            }
            if (meat) {
                totalPrice += 1.25;
                add++;
            }
            if (tomato) {
                totalPrice += 0.50;
                add++;
            }
            if (lettuce) {
                totalPrice += 0.30;
                add++;
            }
            if (carrot) {
                totalPrice += 0.25;
                add++;
            }
            if (onion) {
                totalPrice += 0.35;
                add++;
            }
            if (chips) {
                totalPrice += 1.00;
                add++;
            }
            if (drinks) {
                totalPrice += 1.25;
                add++;
            }
        }
            printResult(totalPrice, order);
    }

    public void printResult(double totalPrice, String order){
        System.out.println("You've asked a " + order + ". The final value is " + totalPrice);
    }

    public void setMeat(boolean meat) {
        this.meat = meat;
    }

    public void setChips(boolean chips) {
        this.chips = chips;
    }

    public void setDrinks(boolean drinks) {
        this.drinks = drinks;
    }
}