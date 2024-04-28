package Assignment7.Q2;

import java.util.List;

// Subject
public interface SongService {
    Song searchById(Integer songID);
    List<Song> searchByTitle(String title);
    List<Song> searchByAlbum(String album);
}
