package com.leonardovieira;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while(count <= 10){
            System.out.println("Enter number #" + count + ":");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                scanner.nextLine();
                count++;
            } else {
                scanner.nextLine();
                System.out.println("Type a valid number");
            }
        }
        System.out.println("The sum is equal to " + sum);
        scanner.close();
    }

}
