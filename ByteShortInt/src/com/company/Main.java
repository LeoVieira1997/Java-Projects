package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        // int has a width of 32
	    int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("Int Total: " + myTotal);

        // short has a width of 16
        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;
        short myShortTotal = (short)(myMinShortValue/2);
        System.out.println("Short Total: " + myShortTotal);

        //byte has a width of 8
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;
        byte myByteTotal = (byte)(myMinByteValue/2);
        System.out.println("Byte Total: " + myByteTotal);

        //long has a width of 64
        long myMinLongValue = -9_223_372_036_854_775_808L;
        long myMaxLongValue = 9_223_372_036_854_775_807L;
        long myLongTotal = (long)(myMinLongValue/2);
        System.out.println("Long Total: " + myLongTotal);
        */

        byte myByte = 121;
        short myShort = 8845;
        int myInt = 655234869;
        long myLong = 50000L + 10L *(myByte + myShort + myInt);
        System.out.println("");
        System.out.println(myLong);

    }
}
