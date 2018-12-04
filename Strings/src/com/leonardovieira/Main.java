package com.leonardovieira;

public class Main {

    public static void main(String[] args) {
	String myString = "This is a string";
        System.out.println("myString = " + myString);
        myString += " and this is more. \u00A9 2018";
        System.out.println("myString = " + myString);
        float abc = 123f;
        myString = "ads" + abc;
        System.out.println("myString = " + myString);
        short gfra = 54;
        myString = "sdf" + gfra;
        System.out.println("myString = " + myString);
        boolean re = true;
        myString = "sdfg" + re;
        System.out.println("myString = " + myString);
        char as = 'E';
        myString = "dfg" + as;
        System.out.println("myString = " + myString);
    }
}
