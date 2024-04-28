package Assignment7.Q2;

import java.util.*;

// Real Object
public class SongLibrary implements SongService{
    
    private HashMap<Integer, Song> songs;

    public SongLibrary(HashMap<Integer, Song> songs){
        this.songs = songs;
    }

    public Song searchById(Integer songID){
        try{
            Thread.sleep(1000);
        } catch(Exception e){}
        for(Song song: songs.values()){
            if(song.getId() == songID){
                return song;
            }
        }
        return null;
    }

    public List<Song> searchByTitle(String title){
        List<Song> songsWithTitle = new ArrayList<>();
        try{
            Thread.sleep(1000);
        } catch(Exception e){}
        for(Song song: songs.values()){
            if(song.getTitle() == title){
                songsWithTitle.add(song);
            }
        }
        if(songsWithTitle.size() > 0){
            return songsWithTitle;
        }
        else{
            return null;
        }
    }
    
    public List<Song> searchByAlbum(String album){
        List<Song> songsWithAlbum = new ArrayList<>();
        try{
            Thread.sleep(1000);
        } catch(Exception e){}
        for(Song song: songs.values()){
            if(song.getAlbum() == album){
                songsWithAlbum.add(song);
            }
        }
        if(songsWithAlbum.size() > 0){
            return songsWithAlbum;
        }
        else{
            return null;
        }
    }

    public void displaySongs() {
        System.out.println("Allsong");
        for (Song song : songs.values()) {
            System.out.println(song.toString());
        }
        System.out.println("-------------------------------------------------------");
    }

}
