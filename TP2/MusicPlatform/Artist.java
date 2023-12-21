package TP2.MusicPlatform;

import java.util.ArrayList;

public class Artist {
    private String name;
    private ArrayList<Album> albums;

    public Artist(String name) {
        this.name = name;
        this.albums = new ArrayList<Album>();
    }
    public void addAlbum(Album album) {
        if (albums.contains(album)) {
            System.out.println(album.getAlbumName()+" already exists");
            return;
        }
        albums.add(album);
        System.out.println(album.getAlbumName()+" added Successfully under "+name+" artist");
    }
    public void deleteAlbum(String albumName) {
        for (Album album : albums) {
            if (album.getAlbumName().equals(albumName)) {
                albums.remove(album);
                System.out.println(albumName+" removed Successfully from "+name+" artist's albums");
                return;
            }
        }
        System.out.println(albumName+" not found under "+name+" artist");
    }
    public void listAlbums() {
        System.out.println("---------------------------------");
        System.out.println("Albums under "+name+" artist:");
        for (Album album : albums) {
            System.out.println(album.getAlbumName());
        }
        System.out.println("---------------------------------");
    }
    public static void main(String[] args) {
        Artist artist = new Artist("ArtistName");
        Album album = new Album("AlbumName");
        Song song = new Song("SongName","lyrics",20,"genre");
        album.addSong(song);
        album.listSongs();

        artist.addAlbum(album);
        artist.listAlbums();
    }
}
