package com.leonardovieira;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {
    private ArrayList<Album> albumArrayList;
    private LinkedList<Song> songLinkedList;
    private String name;

    public Playlist(String name) {
        this.albumArrayList = new ArrayList<Album>();
        this.songLinkedList = new LinkedList<Song>();
        this.name = name;
    }

    public ArrayList<Album> getAlbumArrayList() {
        return albumArrayList;
    }

    public void setAlbumArrayList(ArrayList<Album> albumArrayList) {
        this.albumArrayList = albumArrayList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void nextSong(Song song){
        ListIterator<Song> listIterator = songLinkedList.listIterator();
    }

    public void previousSong(){

    }

    public void replaySong(){

    }

    public void listSongs(){
        for(int i=0; i<albumArrayList.size();i++){
            System.out.println("Album: " + albumArrayList.get(i).getName());
            for(int j=0; j<albumArrayList.get(i).getSongLinkedList().size(); j++) {
                System.out.println((j + 1) + ". " + albumArrayList.get(i).getSongLinkedList().get(j).getTitle());
            }
        }
    }

}
