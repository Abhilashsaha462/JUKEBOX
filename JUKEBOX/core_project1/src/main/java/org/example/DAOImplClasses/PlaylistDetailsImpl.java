package org.example.DAOImplClasses;

import org.example.DAOInterface.PlaylistDetailsInterface;
import org.example.DBConnection;
import org.example.Model.PlaylistDetails;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlaylistDetailsImpl implements PlaylistDetailsInterface {

    static Connection connection = DBConnection.getConnection();

    @Override
    public List<PlaylistDetails> display_allpdetails() {
        List<PlaylistDetails> playlistDetails1=new ArrayList<>();
        try
        {
            String query="select * from PlaylistDetails";
            Statement st= connection.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
                int pid=rs.getInt(1);
                String pname=rs.getString(2);
                int podcastid=rs.getInt(3);
                int playlistid=rs.getInt(4);
                PlaylistDetails obj=new PlaylistDetails(pid,pname,podcastid,playlistid);
                playlistDetails1.add(obj);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return playlistDetails1;
    }

    @Override
    public List<PlaylistDetails> sort_pname() {
        List<PlaylistDetails> playlistDetails2=new ArrayList<>();
        try
        {
            String query="select * from PlaylistDetails order by pname";
            Statement st= connection.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
                int pid=rs.getInt(1);
                String pname=rs.getString(2);
                int podcastid=rs.getInt(3);
                int playlistid=rs.getInt(4);
                PlaylistDetails obj1=new PlaylistDetails(pid,pname,podcastid,playlistid);
                playlistDetails2.add(obj1);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return playlistDetails2;
    }

    @Override
    public List<PlaylistDetails> search_pid() {
        List<PlaylistDetails> playlistDetails3=new ArrayList<>();
        try
        {
            String query="select * from PlaylistDetails where pid= 10003 ";
            Statement st= connection.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
                int pid=rs.getInt(1);
                String pname=rs.getString(2);
                int podcastid=rs.getInt(3);
                int playlistid=rs.getInt(4);
                PlaylistDetails obj2=new PlaylistDetails(pid,pname,podcastid,playlistid);
                playlistDetails3.add(obj2);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return playlistDetails3;
    }
}

