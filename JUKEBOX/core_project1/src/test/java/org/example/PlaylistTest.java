package org.example;

import org.example.DAOImplClasses.PlaylistImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class PlaylistTest {
    PlaylistImpl playlistimplObj = new PlaylistImpl();

    @BeforeEach
    public void setUp()
    {
       playlistimplObj =new PlaylistImpl();
    }
    @AfterEach
    public void tearDown() {
        playlistimplObj = null;
    }
    @Test
    public void display_allplaylist()
    {
        assertEquals(5,playlistimplObj.display_allplaylist().size());
        int expected= 101;
        int actual=playlistimplObj.display_allplaylist().get(0).getPlaylistid();
        assertEquals(expected,actual);
    }
    @Test
    public void sort_playlist(){
        String expected= "Dark";
        String actual=playlistimplObj.sort_playlist().get(0).getPlaylistname();
        assertEquals(expected,actual);

        int expectedplaylistid = 101;
        int actualactual =playlistimplObj.sort_playlist().get(0).getPlaylistid();
        assertEquals(expected,actual);
    }
}
