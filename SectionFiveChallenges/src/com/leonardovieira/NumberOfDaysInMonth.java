package com.leonardovieira;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000) + "\n");
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear(int year){
        if ((year >= 1) && (year <= 9999)){
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year){
        int days = 0;

        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10:
                days = 31;
                break;

            case 2:
                if (isLeapYear(year) && month == 2){
                    days = 29;
                } else if (!isLeapYear(year) && month == 2){
                    days = 28;
                }
                break;

            case 4: case 6: case 11:
                days = 30;
                break;

            case 9: case 12:
                days = 29;
                break;
        }

        return ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)) ? days : -1;
    }
}
