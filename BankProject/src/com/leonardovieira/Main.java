package com.leonardovieira;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static Bank bank = new Bank();
    public static void main(String[] args) {
        boolean quit = false;
        startApplication();
        printActions();
        while (!quit) {
            System.out.println("\nEnter action (5 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    addNewBranch();
                    break;
                case 2:
                    addNewCustomer();
                    break;
                case 3:
                    addNewTransaction();
                    break;
                case 4:
                    printList();
                    break;
                case 5:
                    printActions();
                    break;
            }
        }
    }

    public static void startApplication(){
        System.out.println("Starting application...");
    }

    public static void addNewBranch(){
        System.out.println("Enter the branch's name: ");
        String name = scanner.nextLine();
        bank.addNewBranch(name);
    }

    public static void addNewCustomer(){
        System.out.println("Enter the branch's name: ");
        String branchName = scanner.nextLine();
        if(bank.findBranch(branchName) >= 0){
            System.out.println("Enter the customer's name: ");
            String customerName = scanner.nextLine();
            System.out.println("Enter the balance: ");
            double balance = scanner.nextDouble();
            bank.getBranches().get(bank.findBranch(branchName)).addNewCustomer(customerName,balance);
        } else {
            System.out.println("This branch doesn't exists");
        }
    }

    public static void addNewTransaction(){
        System.out.println("Enter the branch's name: ");
        String branchName = scanner.nextLine();
        if(bank.findBranch(branchName) >= 0){
            System.out.println("Enter the customer's name: ");
//    ----------------- scanner.nextLine(); -------------------   ---> é uma sugestão, não testei ainda
            String customerName = scanner.nextLine();
            int existingClient = bank.getBranches().get(bank.findBranch(branchName)).findCustomer(customerName);
            if(existingClient >= 0){
                System.out.println("Enter the value of the transaction: ");
                double transaction = scanner.nextDouble();
                bank.getBranches().get(bank.findBranch(branchName)).addNewTransaction(customerName, transaction);
            } else {
                System.out.println(customerName + " don't exist in this branch");
            }
        }
    }

    public static void printList(){
        listOptions();
        System.out.println("\nEnter the option you want: ");
        int option = scanner.nextInt();
        System.out.println("Enter the branch you want to search: ");
        scanner.nextLine();
        String branchName = scanner.nextLine();
        if (bank.findBranch(branchName) >= 0) {
            switch (option) {
                case 1:
                    bank.getBranches().get(bank.findBranch(branchName)).printCustomerList();
                    break;
                case 2:
                    bank.getBranches().get(bank.findBranch(branchName)).printCustomerAndTransactions();
                    break;
                case 3:
                    bank.getBranches().get(bank.findBranch(branchName)).printCustomerAndBalances();
                    break;
            }
        }
    }

    public static void printActions(){
        System.out.println( "\n0  -> Quit" +
                            "\n1  -> Add new branch" +
                            "\n2  -> Add new customer" +
                            "\n3  -> Add new transaction" +
                            "\n4  -> Print report" +
                            "\n5  -> Print list of actions\n");
    }

    public static void listOptions(){
        System.out.println("\n1. Customer List\n" +
                            " 2. Customer and Transactions List\n" +
                            " 3. Customer and Balance");
    }
}
