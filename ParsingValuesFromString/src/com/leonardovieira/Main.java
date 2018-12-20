package com.leonardovieira;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2018.125";
//	    int number = Integer.parseInt(numberAsString);
        double number = Double.parseDouble(numberAsString);

	    numberAsString += 1;
	    number += 1;

        System.out.println(numberAsString);
        System.out.println(number);
    }
}
