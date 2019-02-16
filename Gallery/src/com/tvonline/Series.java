package com.tvonline;

public class Series {
    int nSum(int n){
        int j = 0;
        for(int i = 0; i <= n; i++){
            j += i;
        }
        return j;
    }

    int factorial(int n){
        int j = 1;
        for(int i = 1; i <= n; i++){
            j *= i;
        }
        return j;
    }

    int fibonacci(int n){
        int a = 1, b = 0, aux = 0;
        for(int i = 0; i <= n; i++){
            aux = a;
            a += b;
            b = aux;
        }
        return a;
    }
}
