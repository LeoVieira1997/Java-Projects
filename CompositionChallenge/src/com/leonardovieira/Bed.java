package com.leonardovieira;

public class Bed {
    private Dimensions dimensions;
    private String type;
    private boolean isSleeping;

    public Bed(Dimensions dimensions, String type) {
        this.dimensions = dimensions;
        this.type = type;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getType() {
        return type;
    }

    public void goToSleep(){
        if (isSleeping){
            System.out.println("You're already sleeping!");
        } else {
            System.out.println("Going to sleep");
        }
    }
}
