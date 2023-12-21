package TP2.MusicPlatform;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Person {
    protected String name;
    protected HashMap<String,Playlist> playlists;

    protected class Playlist {
        private String name;
        public ArrayList<Song> songs;
        
        public Playlist(String name) {
            this.name = name;
            this.songs = new ArrayList<Song>();
        }
        public Playlist(String name, Song[] songs) {
            this.name = name;
            this.songs = new ArrayList<Song>();
            for (Song song : songs) {
                this.songs.add(song);
            }
        }
        public String getPlaylistName() {
            return name;
        }
     
        public void addSong(Song song) {
            if (songs.contains(song)) {
                System.out.println(song.getSongName()+" already in playlist");
                return;
            }
            songs.add(song);
            System.out.println(song.getSongName()+" added Successfully to "+name+" playlist");
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
                    System.out.println(songName+" removed Successfully from "+name+" playlist");
                    return;
                }
            }
            System.out.println(songName+" not found in "+name+" playlist");
        }
        public void shuffle() {
            System.out.println("Shuffling "+name+" playlist");
            for (int i = 0; i < songs.size()/2; i++) {
                int randomIndex = ThreadLocalRandom.current().nextInt(0, songs.size());
                Song temp = songs.get(i);
                songs.set(i, songs.get(randomIndex));
                songs.set(randomIndex, temp);
            }
        }
        public void listSongs() {
            System.out.println("---------------------------------");
            System.out.println("Songs in "+name+" playlist:");
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
            System.out.println(songName+" not found in "+name+" playlist");
        }
        public void playPlaylist() {
            System.out.println("Playing "+name+" playlist");
            for (Song song : songs) {
                song.playSong();
            }
        }
    }
}
