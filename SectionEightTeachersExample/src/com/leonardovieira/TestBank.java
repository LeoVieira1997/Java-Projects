package com.leonardovieira;

public class TestBank {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        if(bank.addBranch("Adelaide")){
            System.out.println("Adelaide branch created");
        }

        bank.addCustomer("Adelaide", "Leo", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Tim", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Leo", 44.22);
        bank.addCustomerTransaction("Adelaide", "Leo", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomer("Adelaide", true);
        bank.listCustomer("Sydney", true);

        bank.addBranch("Melbourne");

        if(!bank.addCustomerTransaction("Melbourne", "Brian", 5.53)){
            System.out.println("Error Melbourne branch doesn't exist");
        }

        if(!bank.addBranch("Adelaide")){
            System.out.println("Adelaide branch already exists");
        }

        if(!bank.addCustomerTransaction("Adelaide" ,"Fergus", 52.33)){
            System.out.println("Customer doesn't exist at branch");
        }

        if(!bank.addCustomer("Adelaide", "Tim", 12.21)){
            System.out.println("Customer Tim already exists");
        }
    }

}
