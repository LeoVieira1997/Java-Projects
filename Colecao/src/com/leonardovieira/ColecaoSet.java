package com.leonardovieira;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColecaoSet {
    public static void main(String[] args) {
        String[] cores = {"verde", "amarelo", "azul", "branco", "verde", "amarelo", "azul"};

        List<String> list = Arrays.asList(cores);

        Set<String> set = new HashSet<>(list);

        System.out.println(list);
        System.out.println(set);

    }
}
