package com.leonardovieira;

public class Main {

    public static void main(String[] args) {
//	      int newScore = calculateScore("Leo", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);
        calcFeetAndInchesToCentimeters(11, 9);
        calcFeetAndInchesToCentimeters(18);
    }

    /*public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unknown player scored " + score + " points");
        return score * 1000;
    }

    public static void calculateScore(){
        System.out.println("No player name, no player score");
    }*/
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet >= 0 || inches >= 0 || inches <= 12){
            double centimeters = (inches * 2.54);
            System.out.println(inches + " Inches equals " + centimeters + "Centimeters");
            inches = feet * 12;
            centimeters = (inches * 2.54);
            System.out.println(feet + " Feet equals " + centimeters + " Centimeters");
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0){
            double feet = inches / 12.00;
            System.out.println(inches + " Inches equals " + feet + " feet");
            calcFeetAndInchesToCentimeters(feet,inches);
        }
        return -1;
    }
}
