package com.example.mymusic;

public class music {
    private String songName;
    private String artist;
    private int songs;

    public music(String songName, String artist , int songs){

        this.songName  = songName;
        this.artist = artist;
        this.songs = songs;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongs() {
        return songs;
    }

    public void setSongs(int songs) {
        this.songs = songs;
    }
}
