package com.leonardovieira;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> contacts = new ArrayList<Contacts>();

    public static void main(String[] args) {
        printMenu();
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.addContact("Leo", "9277-2084");
        mobilePhone.addContact("Test", "9277-8549");
        mobilePhone.addContact("Test", "9277-8549");
        mobilePhone.printListOfContacts();
        mobilePhone.removeContact("Leo");
        mobilePhone.printListOfContacts();
    }

    private static void printMenu(){
        System.out.println("1 - Print list of contacts.");
        System.out.println("2 - Add new contact");
        System.out.println("3 - Update existing contact");
        System.out.println("4 - Remove contact");
        System.out.println("5 - Find contact");
        System.out.println("6 - Quit");
    }

    public void printListOfContacts(){
        for (int i = 0; i < contacts.size(); i++){
            System.out.println((i+1) + " -- " +
                            this.contacts.get(i).getName() + " -> " +
                            this.contacts.get(i).getNumber());
        }
    }

    private void addContact(String name, String number){
        Contacts contact = new Contacts(name, number);
        contacts.add(contact);
    }

    private void updateContact(String name, Contacts newData){
        if (onFile(name)){
            contacts.set(findContact(name),newData);
        }
    }

    private void removeContact(String name){
        if (onFile(name)){
            contacts.remove(name);
        }
    }

    private int findContact(String searchItem){
        for(int i = 0; i < this.contacts.size(); i++){
            Contacts contact = this.contacts.get(i);
            if(contact.getName().equals(searchItem)){
                return i;
            }
        }
        return -1;
    }

    public boolean onFile(String searchItem){
        int position = findContact(searchItem);
        if (position >= 0){
            return true;
        }
        return false;
    }

}
