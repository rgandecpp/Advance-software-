package Assignment7.Q2;

import java.util.*;

public class Driver {

    public static void main(String[] args){

        HashMap<Integer, Song> songs = new HashMap<>();
        Song song1 = new Song("Love Story", "Taylor Swift", "Fearless", 176, 1);
        Song song2 = new Song("Hey Stephen", "Taylor Swift", "Fearless", 158, 2);
        Song song3 = new Song("You Belong with Me", "Taylor Swift", "Fearless", 231, 3);
        Song song4 = new Song("Shake It Off", "Taylor Swift", "1989", 219, 4);
        Song song5 = new Song("Blank Space", "Taylor Swift", "1989", 231, 5);
        Song song6 = new Song("Shape of You", "Ed Sheeran", "Divide", 233, 6);
        Song song7 = new Song("Castle on the Hill", "Ed Sheeran", "Divide", 213, 7);
        Song song8 = new Song("Thinking Out Loud", "Ed Sheeran", "x", 281, 8);
        Song song9 = new Song("Attention", "Charlie Puth", "Voicenotes", 207, 9);

        songs.put(1, song1);
        songs.put(2, song2);
        songs.put(3, song3);
        songs.put(4, song4);
        songs.put(5, song5);
        songs.put(6, song6);
        songs.put(7, song7);
        songs.put(8, song8);
        songs.put(9, song9);

        SongLibrary songLibrary = new SongLibrary(songs);
        songLibrary.displaySongs();
        SongService songProxy = new SongProxy(songLibrary);


        System.out.println("Search Criteria: By ID (ID: 4)");
        System.out.println(songProxy.searchById(4));
        System.out.println("-------------------------------------------------------");

        System.out.println("Search Criteria: By Title (Title: Shape of You)");
        System.out.println(songProxy.searchByTitle("Shape of You"));

        System.out.println("-------------------------------------------------------");
        System.out.println("Search Criteria: By Album (Album: Divide)");
        displaySearchResults(songProxy.searchByAlbum("Divide"));
        System.out.println("-------------------------------------------------------");

        //
        // Part A:
        // Measure the time it takes to search for songs without the proxy
        //
        long startTime = System.currentTimeMillis();

        // Search for songs by ID, Title, Album
        songProxy.searchById(1);
        songProxy.searchByTitle("Love Story");
        songProxy.searchByAlbum("Fearless");

        long endTime = System.currentTimeMillis();
        System.out.println("Time without proxy: " + (endTime - startTime) + " ms");
        System.out.println("-------------------------------------------------------");


        //
        // Part B:
        // Measure the time it takes to search for songs with the caching proxy
        // AFTER all songs have been cached
        //
        startTime = System.currentTimeMillis();

        // Search for songs by ID, Title, Album
        songProxy.searchById(1);
        songProxy.searchByTitle("Love Story");
        songProxy.searchByAlbum("Fearless");

        long endTimeProxy = System.currentTimeMillis();
        System.out.println("Time with proxy after caching: " + (endTimeProxy - startTime) + " ms");




    }
    private static void displaySearchResults(List<Song> songs) {
        // Method to display search results song by song
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
