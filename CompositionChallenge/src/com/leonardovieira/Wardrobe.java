package com.leonardovieira;

public class Wardrobe {
    private Dimensions dimensions;
    private int numOfDoors;
    private boolean openClose;

    public Wardrobe(Dimensions dimensions, int numOfDoors) {
        this.dimensions = dimensions;
        this.numOfDoors = numOfDoors;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    private boolean isDoorOpen() {
        return openClose;
    }

    public void openDoor(){
        if (!isDoorOpen()){
            this.openClose = true;
            System.out.println("Door opened");
        } else {
            System.out.println("Door already opened");
        }
    }
}
