package org.example.DAOImplClasses;

import org.example.DAOInterface.PlaylistInterface;
import org.example.DBConnection;
import org.example.Model.Playlist;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlaylistImpl implements PlaylistInterface {

    static Connection connection = DBConnection.getConnection();
    @Override
    public boolean createAccount(int playlistid, String playlistname, String userid) {
        try {
            if (playlistname == null || userid== null) {
                System.out.println("All Field Required!");
                return false;
            }
            String sql = "insert into  Playlist (playlistid ,playlistname ,userid) values (?,?,?)";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, playlistid);
            st.setString(2, playlistname);
            st.setString(3, userid);
            int rows = st.executeUpdate();
            System.out.println("Inserted Successfully");
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Playlist> display_allplaylist() {
        List<Playlist> playList1=new ArrayList<>();
        try
        {
            String query="select * from Playlist";
            Statement st= connection.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
                int playlistid=rs.getInt(1);
                String playlistname=rs.getString(2);
                String userid=rs.getString(3);
                Playlist obj=new Playlist(playlistid,playlistname,userid);
                playList1.add(obj);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return playList1;
    }

    @Override
    public List<Playlist> sort_playlist() {
        List<Playlist> playList2=new ArrayList<>();
        try
        {
            String query="select * from Playlist order by playlistname";
            Statement st= connection.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
                int playlistid=rs.getInt(1);
                String playlistname=rs.getString(2);
                String userid=rs.getString(3);
                Playlist obj1=new Playlist(playlistid,playlistname,userid);
                playList2.add(obj1);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return playList2;
    }

    @Override
    public List<Playlist> search_playlist() {
        List<Playlist> playList3=new ArrayList<>();
        try
        {
            String query="select * from Playlist where playlistid= 101 ";
            Statement st= connection.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
                int playlistid=rs.getInt(1);
                String playlistname=rs.getString(2);
                String userid=rs.getString(3);
                Playlist obj2=new Playlist(playlistid,playlistname,userid);
                playList3.add(obj2);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return playList3;
    }
}
