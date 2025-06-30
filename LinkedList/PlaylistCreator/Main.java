import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Creating an album
        Album album = new Album("Greatest Hits", "The Eagles");

        //Adding songs to the album
        album.addSong("Hotel California", 6.30);
        album.addSong("Desperado", 3.45);
        album.addSong("Life in the fast lane", 4.35);

        //Creating a playlist
        LinkedList<Song> playlist = new LinkedList<>();

        //Adding songs to playlists
        System.out.println(album.addToPlayList(1, playlist));
        System.out.println(album.addToPlayList(2, playlist));

        System.out.println(album.addToPlayList("Hotel California", playlist));
        System.out.println(album.addToPlayList("Life in the fast lane", playlist));

        System.out.println("\nPlaylist");
        for(Song song: playlist){
            System.out.println(song);
        }

    }
}