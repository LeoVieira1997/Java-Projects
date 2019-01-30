package com.leonardovieira;

import java.util.ArrayList;

public class Main {
        private String name;
        private double balance;

    public static void main(String[] args) {
        Main main = new Main("Leo", 54.96);
        Main another;
        another = main;
        System.out.println(another.getName()+another.getBalance());

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        integerArrayList.add(1);
        integerArrayList.add(3);
        integerArrayList.add(4);

        for(int i=0; i<integerArrayList.size(); i++){
            System.out.println(i + ": " + integerArrayList.get(i));
        }

        integerArrayList.add(1,2);
    }


    public Main(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
