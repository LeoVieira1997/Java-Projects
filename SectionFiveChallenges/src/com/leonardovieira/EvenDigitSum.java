package com.leonardovieira;

public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number){
        int lastDigit = 0;
        int even = 0;
        if (number >= 0) {
            while (number != 0) {
                lastDigit = number % 10;
                number = number / 10;
                if ((lastDigit % 2) == 0) {
                    even += lastDigit;
                }
            }
            return even;
        } else {
            return -1;
        }
    }
}
