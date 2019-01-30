package com.leonardovieira;

import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name, year;
    private LinkedList<Song> songLinkedList;

    public Album(String name, String year, LinkedList<Song> songLinkedList) {
        this.name = name;
        this.year = year;
        this.songLinkedList = new LinkedList<Song>(songLinkedList);
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public LinkedList<Song> getSongLinkedList() {
        return this.songLinkedList;
    }


}
