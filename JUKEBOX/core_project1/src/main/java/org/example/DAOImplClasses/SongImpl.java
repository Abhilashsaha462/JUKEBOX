package org.example.DAOImplClasses;

import org.example.DAOInterface.SongInterface;
import org.example.DBConnection;
import org.example.Model.Songs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SongImpl implements SongInterface
{
    @Override
    public List<Songs> display_allsongs() {
        List<Songs> songList1=new ArrayList<>();
        try
        {
            Connection connection= DBConnection.getConnection();
            String query="select * from Songs";
            Statement st= connection.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
                int songid=rs.getInt(1);
                String artist=rs.getString(2);
                String genre=rs.getString(3);
                String songname=rs.getString(4);
                String language=rs.getString(5);
                String filepath=rs.getString(6);
                int pid=rs.getInt(7);
                Songs obj=new Songs(songid,artist,genre,songname,language,filepath,pid);
                songList1.add(obj);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return songList1;
    }

    public List<Songs> sort_song() {
        List<Songs> songList2=new ArrayList<>();
        try
        {
            Connection connection= DBConnection.getConnection();
            String query="select * from Songs order by songname";
            Statement st= connection.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
                int songid=rs.getInt(1);
                String artist=rs.getString(2);
                String genre=rs.getString(3);
                String songname=rs.getString(4);
                String language=rs.getString(5);
                String filepath=rs.getString(6);
                int pid=rs.getInt(7);
                Songs obj1=new Songs(songid,artist,genre,songname,language,filepath,pid);
                songList2.add(obj1);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return songList2;
    }

    @Override
    public List<Songs> search_song() {
        List<Songs> songList3=new ArrayList<>();
        try
        {
            Connection connection= DBConnection.getConnection();
            String query="select * from Songs where songid= 1002 ";
            Statement st= connection.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
                int songid=rs.getInt(1);
                String artist=rs.getString(2);
                String genre=rs.getString(3);
                String songname=rs.getString(4);
                String language=rs.getString(5);
                String filepath=rs.getString(6);
                int pid=rs.getInt(7);
                Songs obj2=new Songs(songid,artist,genre,songname,language,filepath,pid);
                songList3.add(obj2);
            }
        }catch(Exception e){
            System.out.println(e);
        }
       return songList3;
    }
}
