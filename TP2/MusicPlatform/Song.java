package TP2.MusicPlatform;

public class Song {
    private String name;
    private String lyrics;
    private int length;
    private String genre;

    public Song(String name, String lyrics, int length, String genre) {
        this.name = name;
        this.lyrics = lyrics;
        this.length = length;
        this.genre = genre;
    }

    public String getSongName() {
        return name;
    }
    public int getSongLength() {
        return length;
    }
    public String getSongGenre() {
        return genre;
    }
    public void playSong() {
        System.out.println("Playing " + name);
        System.out.println("────@───────────────────");
        System.out.println(lyrics);
    }
    public static void main(String[] args) {
        Song song = new Song("Never Gonna Give You Up",
                "We're no strangers to love\r\n" + //
                "You know the rules and so do I (do I)\r\n" + //
                "A full commitment's what I'm thinking of\r\n" + //
                "You wouldn't get this from any other guy\r\n" + //
                "I just wanna tell you how I'm feeling\r\n" + //
                "Gotta make you understand\r\n" + //
                "Never gonna give you up\r\n" + //
                "Never gonna let you down\r\n" + //
                "Never gonna run around and desert you\r\n" + //
                "Never gonna make you cry\r\n" + //
                "Never gonna say goodbye\r\n" + //
                "Never gonna tell a lie and hurt you", 213, "Pop");
        song.playSong();
    }
}
