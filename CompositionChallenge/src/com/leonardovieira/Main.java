package com.leonardovieira;

public class Main {

    public static void main(String[] args) {
        Dimensions bedDimensions = new Dimensions(190,80,80);
        Dimensions tableDimensions = new Dimensions(120, 100, 70);
        Dimensions wardrobeDimensions = new Dimensions(160, 250, 50);
        Bed myBed = new Bed(bedDimensions, "Single");
        Table myTable = new Table(tableDimensions, "Wood");
        Wardrobe myWardrobe = new Wardrobe(wardrobeDimensions, 8);

        Bedroom myBedroom = new Bedroom(myBed, myTable, myWardrobe);
        myBedroom.getMyWardrobe().openDoor();
    }
}
