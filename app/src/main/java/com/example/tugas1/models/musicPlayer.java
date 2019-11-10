package com.example.tugas1.models;

public class musicPlayer {
    public String musicName;
    public String musicAlbum;
    public String musicArtist;

    public musicPlayer(String musicArtist) {
        this.musicArtist = musicArtist;
    }

    public musicPlayer(String musicName, String musicAlbum) {
        this.musicName = musicName;
        this.musicAlbum = musicAlbum;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getMusicAlbum() {
        return musicAlbum;
    }

    public String getMusicArtist() {
        return musicArtist;
    }

    public void setMusicArtist(String musicArtist) {
        this.musicArtist = musicArtist;
    }

    public void setMusicAlbum(String musicAlbum) {
        this.musicAlbum = musicAlbum;
    }
}
