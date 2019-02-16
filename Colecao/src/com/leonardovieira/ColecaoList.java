package com.leonardovieira;

import java.util.ArrayList;
import java.util.List;

public class ColecaoList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Futebol");
        list.add("Basquete");
        list.add("Tênis");
        list.add("Volei");
        list.add("Natação");
        list.add("Hockey");
        list.add("Boxe");
        list.add("Futebol");

        System.out.println(list.indexOf("Hockey"));
        for(int i = 0; i < list.size(); i++){
            list.set(i, list.get(i).toUpperCase());
        }
        System.out.println(list);
        System.out.println(list.indexOf("VOLEI"));
        System.out.println(list.subList(0,4));
        list.subList(2,6).clear();
        System.out.println(list);
    }
}
