package com.leonardovieira;

public class FlourPacker {

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,12));
        System.out.println(canPack(-3,2,12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        final int BIG_COUNT = 5;
        final int SMALL_COUNT = 1;
        if ((bigCount) < 0 || (smallCount < 0) || (goal < 0)){
            return false;
        }
        if ((BIG_COUNT * bigCount) > goal){
            return false;
        } else if ((BIG_COUNT * bigCount) + (SMALL_COUNT * smallCount) >= goal){
            return true;
        }
        return false;
    }
}
