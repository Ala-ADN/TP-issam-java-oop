package TP2.MusicPlatform;

public class PremiumUser extends FreeUser {
    public PremiumUser(String name) {
        super(name);
    }

    @Override
    public void createPlaylist(String playlistname) {
        if (playlists.containsKey(playlistname)) {
            System.out.println(playlistname+" playlist already exists");
            return;
        }
        playlists.put(playlistname, new Playlist(playlistname));
        System.out.println(playlistname+" playlist created successfully");
    }

    public void shufflePlaylist(String playlistname) {
        if (!playlists.containsKey(playlistname)) {
            System.out.println(playlistname+" playlist not found");
            return;
        }
        playlists.get(playlistname).shuffle();
        System.out.println(playlistname+" playlist has been shuffled");
    }
    public static void main(String[] args) {
        PremiumUser premiumuser = new PremiumUser("PremiumUser");
        premiumuser.createPlaylist("Playlist1");
        premiumuser.createPlaylist("Playlist2");
        premiumuser.createPlaylist("Playlist3");
        premiumuser.createPlaylist("Playlist4");

        premiumuser.addToPlaylist("Playlist1", new Song("Song1", "Lyrics1", 1, "Genre1"));
        premiumuser.addToPlaylist("Playlist1", new Song("Song2", "Lyrics2", 2, "Genre2"));
        premiumuser.addToPlaylist("Playlist1", new Song("Song3", "Lyrics3", 3, "Genre3"));

        premiumuser.shufflePlaylist("Playlist1");
        premiumuser.listSongs("Playlist1");

    }
}
