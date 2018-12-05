package com.leonardovieira;

import org.jetbrains.annotations.Contract;

public class Main {

    public static void main(String[] args) {
        /*int highScore = calculateScore(true, 1000, 5, 100);
        System.out.println(highScore);*/
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Leonardo", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Percy", highScorePosition);
    }

    @Contract(pure = true)
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000){
            return 2;
        } else if (playerScore >= 100 && playerScore < 500){
            return 3;
        } else {
            return 4;
        }
    }
}
