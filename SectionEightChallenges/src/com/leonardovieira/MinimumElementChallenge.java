package com.leonardovieira;

import java.util.Scanner;

public class MinimumElementChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numOfElements = 0;
        System.out.println("How many elements do you want?");
        numOfElements = scanner.nextInt();
        printMinimum(findMin(readIntegers(numOfElements)));

    }

    private static int[] readIntegers(int numOfElements){
        int[] array = new int[numOfElements];
        for (int i = 0; i < array.length; i++){
            System.out.println("Type the value: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static void printMinimum(int min){
        System.out.println("The minimum is: " + min);
    }
}
