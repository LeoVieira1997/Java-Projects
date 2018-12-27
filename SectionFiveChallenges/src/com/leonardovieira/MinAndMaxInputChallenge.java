package com.leonardovieira;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0 , max = 0;
        boolean first = true;
        while(true){
            System.out.println("Enter number");
            if (scanner.hasNextInt()){
                int number = scanner.nextInt();
                if (first){
                    first = false;
                    max = number;
                    min = number;
                }

                if (number < min){
                    min = number;
                } else if (number > max){
                    max = number;
                }
            } else {
                break;
            }
        }
        System.out.println("The greater value was " + max);
        System.out.println("The lesser value was " + min);
        scanner.close();
    }
}
