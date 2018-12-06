package com.leonardovieira;

import org.jetbrains.annotations.Contract;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,2,3));
    }
    @Contract(pure = true)
    public static boolean hasEqualSum(int one, int two, int three){
        return ((one + two) == three) ? true : false;
    }
}
