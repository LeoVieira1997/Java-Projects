package com.leonardovieira;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public void addNewBranch(String name){
            if (findBranch(name) != -1) {
                System.out.println("This branch already exists");
            } else {
                Branch branch = new Branch(name);
                branches.add(branch);
                System.out.println("Branch added successfully");
            }
    }

    public void printBranches(){
        for(int i=0; i<branches.size(); i++){
            System.out.println((i+1) + ". " +
                                branches.get(i).getName());
        }
    }

    public int findBranch(String name){
        for(int i=0; i<branches.size(); i++){
            String branchName = branches.get(i).getName();
            if(branchName.equals(name)){
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }
}
