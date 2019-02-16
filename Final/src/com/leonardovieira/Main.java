package com.leonardovieira;

public class Main {

    public static void main(String[] args) {
//         SomeClass one = new SomeClass("one");
//         SomeClass two = new SomeClass("two");
//         SomeClass three = new SomeClass("three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
//        System.out.println(Math.PI);
//
//        int pw = 45654;
//        Password password = new Password(pw);
//        password.storePassword();
//
//        password.letMeIn(1);
//        password.letMeIn(4568);
//        password.letMeIn(9849);
//        password.letMeIn(0);
//        password.letMeIn(-1);
//        password.letMeIn(45654);

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }
}
