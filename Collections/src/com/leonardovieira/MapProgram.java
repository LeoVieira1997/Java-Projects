package com.leonardovieira;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented, platform independent language");
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "therein lies madness");

        if(languages.containsKey("Java")){
            System.out.println("Java is already in the Map");
        } else {
            languages.put("Java", "this course is about Java");
        }

        for(String key : languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
