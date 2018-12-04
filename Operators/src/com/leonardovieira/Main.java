package com.leonardovieira;

public class Main {

    public static void main(String[] args) {
	    // Challenge

        double d = 20;
        double dd = 80;
        double total = (d + dd) * 25;
        System.out.println("Total: " + total);
        double theRemainder = total % 40;
        System.out.println("Remainder " + theRemainder);
        if(theRemainder <= 20)
            System.out.println("Total was over the limit");
    }
}
