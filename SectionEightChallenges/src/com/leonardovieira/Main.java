package com.leonardovieira;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	    int[] array = getIntegers();
	    printArray(sortIntegers(array));
    }

    public static int[] getIntegers(){
        System.out.println("How much numbers the array will have: ");
        int[] getMethodArray = new int[scanner.nextInt()];
        for (int i = 0; i < getMethodArray.length; i++){
            System.out.println("Type the number: ");
            getMethodArray[i] = scanner.nextInt();
        }
        return getMethodArray;
    }

    public static int[] sortIntegers(int[] array) {
        int max = 0, count = 0;
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if(array[j] > max){
                    max = array[j];
                    count = j;
                }
            }
            newArray[i] = max;
            max = 0;
            array[count] = 0;
        }
        return newArray;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
