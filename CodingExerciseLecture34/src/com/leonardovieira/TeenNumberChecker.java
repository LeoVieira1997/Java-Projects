package com.leonardovieira;

public class TeenNumberChecker {
    public static boolean hasTeen(int one, int two, int three){
        if (one > 12 && one < 20 || two > 12 && two < 20 || three > 12 && three < 20){
            return true;
        }
        return false;
    }
}
