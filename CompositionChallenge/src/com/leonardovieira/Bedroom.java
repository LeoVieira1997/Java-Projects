package com.leonardovieira;

public class Bedroom {
    private Bed myBed;
    private Table myTable;
    private Wardrobe myWardrobe;

    public Bedroom(Bed myBed, Table myTable, Wardrobe myWardrobe) {
        this.myBed = myBed;
        this.myTable = myTable;
        this.myWardrobe = myWardrobe;
    }

    public Bed getMyBed() {
        return myBed;
    }

    public Table getMyTable() {
        return myTable;
    }

    public Wardrobe getMyWardrobe() {
        return myWardrobe;
    }
}
