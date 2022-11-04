package org.example.DAOInterface;

import org.example.Model.Playlist;

import java.util.List;

public interface PlaylistInterface {

    boolean createAccount(int playlistid, String playlistname, String userid);

    List<Playlist> display_allplaylist();

    List<Playlist> sort_playlist();

    List<Playlist> search_playlist();


}
