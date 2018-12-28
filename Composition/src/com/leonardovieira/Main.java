package com.leonardovieira;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Samsung", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", "v2.44" , 6, 4);

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.getMonitor().drawPixelArt(1500,1200,"red");
        thePC.getMotherboard().loadProgram("Windows");
        thePC.getTheCase().pressPowerButton();
    }
}
