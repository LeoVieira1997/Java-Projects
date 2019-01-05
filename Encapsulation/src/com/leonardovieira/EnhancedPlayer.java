package com.leonardovieira;

public class EnhancedPlayer {
    private String name, weapon;
    private int hitPoints = 100;

    public EnhancedPlayer(String name, String weapon, int hitPoints) {
        this.name = name;
        this.weapon = weapon;
        if (hitPoints > 0 && hitPoints <= 100){
            this.hitPoints = hitPoints;
        }
    }

    public void loseHealth(int damage){
        this.hitPoints -= damage;
        if (this.hitPoints <= 0){
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
