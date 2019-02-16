package com.leonardovieira;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        ((LinkedList<String>) fila).add("Ricardo");
        ((LinkedList<String>) fila).add("Sandra");
        fila.offer("Beatriz");

        System.out.println(fila);

        System.out.println(fila.peek());
        System.out.println(fila.poll());
        System.out.println(fila);

        LinkedList<String> f = (LinkedList<String>) fila;
        f.addFirst("Caio");
        f.addLast("Luana");
        System.out.println(f);

        System.out.println(f.peekFirst());
        System.out.println(f.peekLast());
        System.out.println(f.pollLast());
        System.out.println(f);
    }
}
