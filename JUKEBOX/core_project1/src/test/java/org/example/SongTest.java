package org.example;

import org.example.DAOImplClasses.SongImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongTest {

    SongImpl songImplObj=null;
    @BeforeEach
    public void setUp()
    {
        songImplObj=new SongImpl();
    }
    @AfterEach
    public void tearDown()
    {
        songImplObj=null;
    }
    @Test
    public void display_allsongs()
    {
        assertEquals(3,songImplObj.display_allsongs().size());
        int expected= 1002;
        int actual=songImplObj.display_allsongs().get(2).getSongid();
        assertEquals(expected,actual);
    }

    @Test
    public void sort_song(){
        String expected= "Ranjha";
        String actual=songImplObj.sort_song().get(2).getSongname();
        assertEquals(expected,actual);

        String expectedartist = "B Praak";
        String actualactual =songImplObj.sort_song().get(2).getArtist();
        assertEquals(expected,actual);
    }
}
