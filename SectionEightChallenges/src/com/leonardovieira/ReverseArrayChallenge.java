package com.leonardovieira;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] array = new int[] {1,3,6,9,12,15,18,21};
        System.out.println("Array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed = " + Arrays.toString(array));
    }

//    private static void reverse(int[] array){
//        System.out.println("Normal array:");
//        for (int i = 0; i < array.length; i++){
//            System.out.print("[" + array[i]+ "]" + " ");
//        }
//        System.out.println("\nReversed array:");
//        for (int i = array.length-1; i >= 0; i--){
//            System.out.print("[" + array[i]+ "]" + " ");
//        }
//    }


//    ---------------- Solution Proposed by the teacher -----------------

    private static void reverse(int[] array){
        int maxIndex = array.length-1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
