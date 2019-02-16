package com.leonardovieira;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ColecaoMap {

    public static void main(String[] args) {
        Map<String, String> pais = new HashMap<>();
        pais.put("BR", "Brasil");
        pais.put("CA", "Canada");
        pais.put("US", "United States");
        pais.put("FR", "France");
        pais.put("EN", "England");

        System.out.println(pais.containsKey("CA"));
        System.out.println(pais.containsValue("United States"));
        System.out.println(pais.get("BR"));
        pais.remove("EN");
        System.out.println(pais);

        Set<String> keys = pais.keySet();
        for (String key : keys) {
            System.out.println(key + ": " + pais.get(key));
        }
    }

}
