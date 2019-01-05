package com.leonardovieira;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//
//        player.name = "Leo";
//        player.health = 20;
//        player.weapon = "sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Leo", "Sword", 100);
        System.out.println("Initial health is " + player.getHealth());
    }
}
