package com.leonardovieira;

import java.util.*;

public class TestPlayList {
    private static List<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");
        Album.SongList songList = album.new SongList();
        album.getSongList().addSong("Stormbringer", 4.6);
        album.getSongList().addSong("Love don't mean a thing", 4.22);
        album.getSongList().addSong("Holy man", 4.3);
        album.getSongList().addSong("Hold on", 5.6);
        album.getSongList().addSong("Lady double dealer", 3.21);
        album.getSongList().addSong("You can't do it right", 6.23);
        album.getSongList().addSong("High ball shooter", 4.27);
        album.getSongList().addSong("The gypsy", 4.2);
        album.getSongList().addSong("Soldier of Fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.getSongList().addSong("For those about to rock", 5.44);
        album.getSongList().addSong("I put the finger on you", 3.25);
        album.getSongList().addSong("Lets go", 3.45);
        album.getSongList().addSong("Inject the venom", 3.33);
        album.getSongList().addSong("Snowballed", 4.51);
        album.getSongList().addSong("Evil walks", 3.45);
        album.getSongList().addSong("C.O.D", 5.25);
        album.getSongList().addSong("Breaking the rules", 5.32);
        album.getSongList().addSong("Night of the long knives", 5.12);
        albums.add(album);

        List<Song> playList = new Vector<>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList); // does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);

        play(playList);

    }

    private static void play(List<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0){
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing: " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size() >= 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0  - to quit\n" +
                "1  - to play next song\n" +
                "2  - to play previous song\n" +
                "3  - to replay the current song\n" +
                "4  - list songs in the playlist\n" +
                "5  - print available actions\n" +
                "6  - delete current song from playlist");
    }

    private static void printList(List<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("==========================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("==========================");
    }



















}
