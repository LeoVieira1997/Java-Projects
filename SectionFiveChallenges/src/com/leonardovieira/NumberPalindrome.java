package com.leonardovieira;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit = 0;
        int startNumber = number;
        while (number != 0) {
            lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number = number/10;
        }
        return (startNumber == reverse) ? true : false;
    }
}
