package org.example.DAOInterface;

import org.example.Model.PlaylistDetails;

import java.util.List;

public interface PlaylistDetailsInterface {

     List<PlaylistDetails> display_allpdetails();

     List<PlaylistDetails> sort_pname();

     List<PlaylistDetails> search_pid();
}
