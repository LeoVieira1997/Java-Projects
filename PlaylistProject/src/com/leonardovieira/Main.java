package com.leonardovieira;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Playlist> playlistArrayList = new ArrayList<Playlist>();

    public static void main(String[] args) {
//        beginPlaylist();

    }

    public static void showMenu(){
        System.out.println( "       Menu       " +
                "0  - to create a new playlist" +
                "1  - next music" +
                "2  - previous music" +
                "3  - replay music" +
                "4  - list songs" +
                "5  - to show options menu" +
                "6  - to quit");
    }

    public static void beginPlaylist(){
        boolean option = false;
        showMenu();
        Playlist playlist = newPlaylist();
        playlistArrayList.add(playlist);
        while(!option){
            System.out.println("Enter your option: ");
            int action = scanner.nextInt();
            switch(action){
                case 0:
                    playlist = newPlaylist();
                    playlistArrayList.add(playlist);
                    break;
                case 1:
                    playlist.nextSong();
                    break;
                case 2:
                    playlist.previousSong();
                    break;
                case 3:
                    playlist.replaySong();
                    break;
                case 4:
                    playlist.listSongs();
                    break;
                case 5:
                    showMenu();
                    break;
                case 6:
                    option = true;
                    break;
            }
        }
    }

    public static Playlist newPlaylist(){
        System.out.println("Enter the playlist name:");
        String name = scanner.nextLine();
        return new Playlist(name);
    }


















}
