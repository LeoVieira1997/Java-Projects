package com.leonardovieira;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name, artist;
    private SongList songList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
    }

    public SongList getSongList() {
        return songList;
    }

    public boolean addToPlayList(int trackNumber, List<Song> playlist){
        int index = trackNumber -1;
        if((index >= 0) && (index <= this.songList.songs.size())){
            playlist.add(this.songList.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, List<Song> playlist){
        Song checkedSong = songList.findSong(title);
        if(checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }



    public class SongList{
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean addSong(String title, double duration){
            if(findSong(title) == null){
                this.songs.add(new Song(title, duration));
                return true;
            }
            return false;
        }

        private Song findSong(String title){
            for(Song checkSong : this.songs){
                if(checkSong.getTitle().equals(title)){
                    return checkSong;
                }
            }
            return null;
        }

        public Song findSong(int trackNumber){
            int index = trackNumber-1;
            if((index >= 0) && (index<songs.size())){
                return songs.get(index);
            }
            return null;
        }
    }









}
