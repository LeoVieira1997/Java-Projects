package com.leonardovieira;

public class HealthyBurguer extends Hamburger{
    private int tomato, lettuce, carrot, onion, egg, olive;
    public HealthyBurguer(int bread, int meat) {
        super(bread, meat);
    }

    @Override
    public int getTomato() {
        return tomato;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
    }

    @Override
    public int getLettuce() {
        return lettuce;
    }

    public void setLettuce(int lettuce) {
        this.lettuce = lettuce;
    }

    @Override
    public int getCarrot() {
        return carrot;
    }

    public void setCarrot(int carrot) {
        this.carrot = carrot;
    }

    @Override
    public int getOnion() {
        return onion;
    }

    public void setOnion(int onion) {
        this.onion = onion;
    }

    public int getEgg() {
        return egg;
    }

    public void setEgg(int egg) {
        this.egg = egg;
    }

    public int getOlive() {
        return olive;
    }

    public void setOlive(int olive) {
        this.olive = olive;
    }
}
