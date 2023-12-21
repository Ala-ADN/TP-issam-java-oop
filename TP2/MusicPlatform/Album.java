package TP2.MusicPlatform;

import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<Song>();
    }
    public Album(String name, Song[] songs) {
        this.name = name;
        this.songs = new ArrayList<Song>();
        for (Song song : songs) {
            this.songs.add(song);
        }
    }
    public String getAlbumName() {
        return name;
    }

    public void addSong(Song song) {
        if (songs.contains(song)) {
            System.out.println(song.getSongName()+" already in album");
            return;
        }
        songs.add(song);
        System.out.println(song.getSongName()+" added Successfully to "+name+" album");
    }

    public void addSong(Song[] songs) {
        for (Song song : songs) {
            this.addSong(song);
        }
    }
    public void removeSong(String songName) {
        for (Song song : songs) {
            if (song.getSongName().equals(songName)) {
                songs.remove(song);
                System.out.println(songName+" removed Successfully from "+name+" album");
                return;
            }
        }
        System.out.println(songName+" not found in album");
    }
    public void removeSong(int songIndex) {
        songs.remove(songIndex);
    }
    public void listSongs() {
        System.out.println("---------------------------------");
        System.out.println("Songs in "+name+" album:");
        for (Song song : songs) {
            System.out.println(song.getSongName());
        }
        System.out.println("---------------------------------");
    }
    public void playSong(String songName) {
        for (Song song : songs) {
            if (song.getSongName().equals(songName)) {
                song.playSong();
                return;
            }
        }
    }
    public void playSong(int songIndex) {
        songs.get(songIndex).playSong();
    }

    public static void main(String[] args) {
        Song song1 = new Song("Song1", "Lyrics1", 1, "Genre1");
        Song song2 = new Song("Song2", "Lyrics2", 2, "Genre2");
        Song song3 = new Song("Song3", "Lyrics3", 3, "Genre3");
        Song song4 = new Song("Song4", "Lyrics4", 4, "Genre4");
        Album album = new Album("AlbumName", new Song[] {song1, song2});
        album.addSong(new Song[] {song4, song3});
        album.addSong(song1);
        album.listSongs();
        album.playSong("Song1");
    }

}
