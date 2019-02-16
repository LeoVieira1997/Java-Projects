package com.leonardovieira;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        ((ArrayList<String>) c).add("A");
        ((ArrayList<String>) c).add("E");
        ((ArrayList<String>) c).add("I");
        System.out.println(c.toString());
        System.out.println(c.isEmpty());
        System.out.println(c.contains("A"));
        c.remove("A");


        Collection<String> c2 = Arrays.asList("O","U");
        ((ArrayList<String>) c).addAll(c2);
        System.out.println(c.toString());
        c.removeAll(c2);
        System.out.println(c.toString());

        for(String string : c){
            System.out.println(string);
        }

        String[] s = c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(s));

        c.clear();
        System.out.println(c);
    }
}
