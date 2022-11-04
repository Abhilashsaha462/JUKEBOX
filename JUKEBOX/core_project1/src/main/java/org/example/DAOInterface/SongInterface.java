package org.example.DAOInterface;

import org.example.Model.Songs;

import java.util.List;

public interface SongInterface {
    List<Songs> display_allsongs();

    List<Songs> sort_song();

    List<Songs> search_song();

}
