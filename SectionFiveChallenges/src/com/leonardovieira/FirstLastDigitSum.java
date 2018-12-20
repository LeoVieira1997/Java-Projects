package com.leonardovieira;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
    }

    public static int sumFirstAndLastDigit(int number){
        int lastDigit = number % 10;
        int firstDigit = 0;
        if (number < 0){
            return -1;
        }
        while (number != 0){
            firstDigit = number;
            number = number/10;
        }
        return firstDigit + lastDigit;
    }
}
