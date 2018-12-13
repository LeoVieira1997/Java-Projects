package com.leonardovieira;

public class Main {

    public static void main(String[] args) {
        /*int switchValue = 8;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
                System.out.println("Value was 3");
                break;

            case 4: case 5: case 6: case 7:
                System.out.println("Was a four, five, six or seven");
                System.out.println("Actually it was: " + switchValue);
                break;

            default:
                System.out.println("Was not 1 nor 2 and 3");
                break;
        }*/

        char valueChar = 'D';

        switch (valueChar){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(valueChar + " was found");
                break;
            default:
                System.out.println("None of these were found");
        }

        String month = "January";

        switch (month.toLowerCase()) {
            case "january": case "february":
                System.out.println("The month is " + month);
                break;
            default:
                System.out.println("December");
        }

    }
}
