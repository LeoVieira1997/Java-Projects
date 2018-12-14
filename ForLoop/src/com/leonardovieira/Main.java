package com.leonardovieira;

public class Main {

    public static void main(String[] args) {
//        for (double i=8; i>=2; i--){
//            System.out.println("10.000 at "+ i +"% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
//        }

        for (int i = 10, j = 0; i < 50; i++){
            if (isPrime(i)){
                j++;
                System.out.println(i + " is a prime number");
                if (j == 10){
                    System.out.println("Exiting the for Loop");
                    break;
                }
            }
        }
    }

//    public static double calculateInterest(double amount, double interestRate){
//        return (amount * (interestRate/100));
//    }

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++){
            System.out.println("Looping " + i);
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
