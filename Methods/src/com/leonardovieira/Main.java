package com.leonardovieira;

public class Main {

    public static void main(String[] args) {
        calculateScore();
    }

    public static void calculateScore(){
        boolean gameOver = true;
        int score = 3000;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            System.out.println("Your second final score was " + (finalScore = score + (levelCompleted * bonus)));
        }
    }
}
