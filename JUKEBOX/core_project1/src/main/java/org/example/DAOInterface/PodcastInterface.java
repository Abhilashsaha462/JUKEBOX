package org.example.DAOInterface;

import org.example.Model.Podcast;

import java.util.List;

public interface PodcastInterface {

    List<Podcast> display_allpodcasts();

    List<Podcast> sort_podcast();

    List<Podcast> search_podcast();

}
