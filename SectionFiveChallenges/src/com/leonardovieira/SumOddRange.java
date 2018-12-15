package com.leonardovieira;

public class SumOddRange {

    public static void main(String[] args) {
        System.out.println(sumOdd(1,11));
    }

    public static boolean isOdd(int number){
        return ((number >= 0) && (number % 2 != 0));
    }

    public static int sumOdd(int start, int end){
        int odd = 0;
       if ((end >= start) && (start > 0)) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    odd += i;
                }
            }
            return odd;
        } else {
            return -1;
        }
    }
}
