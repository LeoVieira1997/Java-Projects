package com.leonardovieira;

public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(-1));
        System.out.println(area(5,4));
        System.out.println(area(-1,4));
    }

    public static double area(double radius){
        if (radius < 0){
            return -1;
        }
        double circle = radius * radius * 3.14159;
        return circle;
    }
    public static double area(double x, double y){
        if((x < 0) || (y < 0)){
            return -1;
        }
        double rectangle = x * y;
        return rectangle;
    }
}

