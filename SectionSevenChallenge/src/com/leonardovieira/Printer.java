package com.leonardovieira;

public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted;

    public void fillToner(int quantity){
        if (tonerLevel == 100){
            System.out.println("Toner already full");
        } else if ((tonerLevel + quantity) > 100){
            tonerLevel += quantity - 100;
            System.out.println("Toner completely filled up and " + tonerLevel + " left over");
            tonerLevel = 100;
        } else if (quantity > 100 || quantity < 1){
            System.out.println("Invalid value");
        } else {
            tonerLevel += quantity;
            System.out.println("Toner filled up, actual quantity is " + tonerLevel + "%");
        }
    }

    public void printPage(int pages, boolean isDuplex){
        pagesPrinted += pages;
        if (isDuplex){
            pagesPrinted += pages;
            tonerLevel -= pages;
        }
        tonerLevel -= pages;
        System.out.println(pages + " pages printed, total of " + pagesPrinted + " pages printed (including duplex).");
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
