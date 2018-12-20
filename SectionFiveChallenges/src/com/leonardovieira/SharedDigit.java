package com.leonardovieira;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int one, int two){
        if ((one >= 10) && (one <= 99) && (two >= 10) && (two <= 99)){
            int compareOne = one % 10;
            int compareTwo = two % 10;
            one = one / 10;
            two = two / 10;
            while((one != 0) && (two != 0)) {
                return ((compare(compareOne, compareTwo))
                            || (compare(compareOne, two))
                            || (compare(compareTwo, one))
                            || (compare(one, two))) ? true : false;
            }
        }
        return false;
    }

    public static boolean compare (int one, int two){
        if (one == two){
            return true;
        }
        return false;
    }

}
