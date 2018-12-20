package com.leonardovieira;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int one, int two, int three){
        if ((one >= 10) && (one <= 1000) &&
                (two >= 10) && (two <= 1000) &&
                (three >= 10) && (three <= 1000)){
            one = one % 10;
            two = two % 10;
            three = three % 10;
            return ((one == two) || (one == three) || (two == three)) ? true : false;
        }
        return false;
    }
}
