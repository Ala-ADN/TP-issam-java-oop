package TP2.MusicPlatform;

public interface User {
    public void listen(Song song);
    public void listen(String playlistname);
    public void addToPlaylist(String playlistname, Song song);
    public void removeFromPlaylist(String playlistname, String songName);
}
