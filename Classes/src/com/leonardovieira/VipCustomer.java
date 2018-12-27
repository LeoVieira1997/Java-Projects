package com.leonardovieira;

public class VipCustomer {
    private String name, emailAddress;
    private double creditLimit;

    public VipCustomer() {
        this("Total Default", "default@default.com", 50);
        System.out.println("First constructor called.");
    }

    public VipCustomer(String emailAddress, double creditLimit) {
        this("Default", emailAddress, creditLimit);
        System.out.println("Second constructor called.");
    }

    public VipCustomer(String name, String emailAddress, double creditLimit) {
        System.out.println("Third constructor called.");
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
}
