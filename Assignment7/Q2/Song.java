package Assignment7.Q2;

public class Song {
    
    private String title;
    private String artist;
    private String album;
    private int duration;

    private int id;

    public Song(String title, String artist, String album, int duration, int id){
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getArtist(){
        return artist;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getAlbum(){
        return album;
    }

    public void setAlbum(String album){
        this.album = album;
    }

    public int getDuration(){
        return duration;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public String toString(){
        return "Title :- " + title + " | Artist :- " + artist + " | Album :-" + album + " | Duration :- " + duration + " | ID :- " + id;
    }
}
