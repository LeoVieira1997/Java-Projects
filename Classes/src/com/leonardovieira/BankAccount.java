package com.leonardovieira;

public class BankAccount {
    private int number;
    private double balance;
    private String customerName, email, phoneNumber;

    public BankAccount(){
        this(123, 0.00, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(int number, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber){
        this(00, 150.00, customerName, email, phoneNumber);
    }

    public double depositFunds(double funds){
        setBalance(funds);
        return this.getBalance();
    }

    public double withdrawFunds(double funds){
        if (this.getBalance() >= funds){
            this.setBalance(getBalance() - funds);
            System.out.println("Withdrawal accepted, your funds are now " + this.getBalance());
            return this.getBalance();
        } else {
            System.out.println("Insufficient funds!");
            return -1;
        }
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

    private void setBalance(double balance){
        this.balance = balance;
    }

    private double getBalance(){
        return this.balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }
}
