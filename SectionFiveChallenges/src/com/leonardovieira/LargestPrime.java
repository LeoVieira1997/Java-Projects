package com.leonardovieira;

public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {

        if (number <= 1)
            return -1;

        for (int i = number - 1; i > 1; i--) {

            if (number % i == 0) {
                if (number / i > i)
                    number /= i;
                else number = i;
            }
        }
        return number;
    }
}
