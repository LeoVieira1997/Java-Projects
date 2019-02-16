package com.leonardovieira;

import java.util.*;

public class ColecaoUtilitario {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Guaraná");
        list.add("Uva");
        list.add("Banana");
        list.add("Manga");
        list.add("Goiaba");
        list.add("Laranja");
        list.add("Açaí");

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        int i = Collections.binarySearch(list, "Uva");
        System.out.println(i);

        Collections.addAll(list, "Melancia", "Limão");

        List<String> list2 = Arrays.asList("Acerola", "Graviola");
        boolean b = Collections.disjoint(list,list2);
        System.out.println(b);
        System.out.println(list);

//        Collections.fill(list, "Açaí");
//        System.out.println(list);

        Collection<String> constante = Collections.unmodifiableCollection(list);

    }
}
