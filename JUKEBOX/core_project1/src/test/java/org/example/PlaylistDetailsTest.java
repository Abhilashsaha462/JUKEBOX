package org.example;

import org.example.DAOImplClasses.PlaylistDetailsImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaylistDetailsTest {
    PlaylistDetailsImpl playlistDetailsObj = new PlaylistDetailsImpl();

    @BeforeEach
    public void setUp()
    {
        playlistDetailsObj =new PlaylistDetailsImpl();
    }
    @AfterEach
    public void tearDown() {
        playlistDetailsObj = null;
    }
    @Test
    public void display_allpdetails()
    {
        assertEquals(3,playlistDetailsObj.display_allpdetails().size());
        int expected= 10001;
        int actual=playlistDetailsObj.display_allpdetails().get(0).getPid();
        assertEquals(expected,actual);
    }
    @Test
    public void sort_pname(){
        String expected= "Lifetime Sign";
        String actual=playlistDetailsObj.sort_pname().get(1).getPname();
        assertEquals(expected,actual);

        int expectedpid = 10001;
        int actualactual =playlistDetailsObj.sort_pname().get(0).getPid();
        assertEquals(expected,actual);
    }
}
