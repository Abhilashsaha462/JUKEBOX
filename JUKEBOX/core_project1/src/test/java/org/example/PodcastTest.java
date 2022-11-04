package org.example;
import org.example.DAOImplClasses.PodcastImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PodcastTest {
    PodcastImpl podcastImplObj=null;
    @BeforeEach
    public void setUp()
    {
        podcastImplObj=new PodcastImpl();
    }
    @AfterEach
    public void tearDown()
    {
        podcastImplObj=null;
    }
    @Test
    public void display_allpodcasts()
    {
        assertEquals(3,podcastImplObj.display_allpodcasts().size());
        int expected= 1000003;
        int actual=podcastImplObj.display_allpodcasts().get(2).getPodid();
        assertEquals(expected,actual);
    }
    @Test
    public void sort_podcast(){
        String expected= "Meditation";
        String actual=podcastImplObj.sort_podcast().get(2).getPodcastname();
        assertEquals(expected,actual);

        String expectedartist = "Chel Hamilton";
        String actualactual =podcastImplObj.sort_podcast().get(2).getArtist();
        assertEquals(expected,actual);
    }
}
