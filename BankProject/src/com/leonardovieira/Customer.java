package com.leonardovieira;

import java.util.ArrayList;

public class Customer{
    private String name;
    private double balance;

    ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String customerName, double balance) {
        this.name = customerName;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(double amount){
        if((amount + balance) < 0){
            System.out.println("Your balance is too low for this transaction");
        } else {
            this.transactions.add(amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }
}
