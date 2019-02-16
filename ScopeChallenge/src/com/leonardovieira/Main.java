package com.leonardovieira;

import java.util.Scanner;

public class Main {
    public static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        X x = new X();
        System.out.println("Type the number:");
        x.x(x());
    }

    public static int x(){
        int x = 0;
        x = x(x);
        return x;
    }

    public static int x(int i){
        i = x.nextInt();
        return i;
    }
}
