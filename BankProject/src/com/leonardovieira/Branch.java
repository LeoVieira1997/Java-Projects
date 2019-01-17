package com.leonardovieira;

import java.util.ArrayList;

public class Branch{
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public void addNewCustomer(String name, double balance){
        if(findCustomer(name) >= 0) {
            System.out.println("This costumer already exists");
        } else {
            Customer customer = new Customer(name, balance);
            customers.add(customer);
        }
    }

    public void addNewTransaction(String name, Double amount){
        int position = findCustomer(name);
        if(position >= 0){
            customers.get(position).setTransactions(amount);
            customers.get(position).setBalance(amount);
        }
    }

    public int findCustomer(String name){
        for(int i=0; i<customers.size(); i++){
            if(name.equals(customers.get(i).getName())){
                return i;
            }
        }
        return -1;
    }

    public void printCustomerList(){
        System.out.println("-------- List of Customers ---------");
        for(int i=0; i<customers.size(); i++){
            System.out.println((i+1) + ". " + customers.get(i).getName());
        }
    }

    public void printCustomerAndTransactions(){
        System.out.println("List of customers and their respective transactions");
        for(int i=0; i<customers.size(); i++){
            System.out.println((i+1) + ". " +
                                customers.get(i).getName() + ": " +
                                customers.get(i).getTransactions());
        }
    }

    public void printCustomerAndBalances(){
        System.out.println("List of customers and their respective balances");
        for(int i=0; i<customers.size(); i++){
            System.out.println((i+1) +
                    customers.get(i).getName() + ": " +
                    customers.get(i).getBalance());
        }
    }

    public String getName() {
        return name;
    }
}
