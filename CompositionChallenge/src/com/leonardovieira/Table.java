package com.leonardovieira;

public class Table {
    private Dimensions dimensions;
    private String material;

    public Table(Dimensions dimensions, String material) {
        this.dimensions = dimensions;
        this.material = material;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getMaterial() {
        return material;
    }
}
