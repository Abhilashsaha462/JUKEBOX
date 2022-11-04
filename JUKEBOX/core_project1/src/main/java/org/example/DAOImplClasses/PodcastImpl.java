package org.example.DAOImplClasses;

import org.example.DAOInterface.PodcastInterface;
import org.example.DBConnection;
import org.example.Model.Podcast;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PodcastImpl implements PodcastInterface {

    @Override
    public List<Podcast> display_allpodcasts() {
        List<Podcast> podcastList1 = new ArrayList<>();
        try {
            Connection connection = DBConnection.getConnection();
            String query = "select * from Podcast";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                int podid = rs.getInt(1);
                String artist = rs.getString(2);
                String episodes = rs.getString(3);
                String podcastname = rs.getString(4);
                String filepath = rs.getString(5);
                int pid = rs.getInt(6);
                Podcast obj = new Podcast(podid, artist, episodes, podcastname, filepath, pid);
                podcastList1.add(obj);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return podcastList1;
    }

    @Override
    public List<Podcast> sort_podcast() {
        List<Podcast> podcastList2 = new ArrayList<>();
        try
        {
            Connection connection= DBConnection.getConnection();
            String query="select * from Podcast order by podcastname";
            Statement st= connection.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
                int podid=rs.getInt(1);
                String artist=rs.getString(2);
                String episodes=rs.getString(3);
                String podcastname=rs.getString(4);
                String filepath=rs.getString(5);
                int pid=rs.getInt(6);
                Podcast obj1=new Podcast(podid,artist,episodes,podcastname,filepath,pid);
                podcastList2.add(obj1);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return podcastList2;
    }

    @Override
    public List<Podcast> search_podcast() {
        List<Podcast> podcastList3 = new ArrayList<>();
        try
        {
            Connection connection= DBConnection.getConnection();
            String query="select * from Podcast where podid= 1000003";
            Statement st= connection.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
                int podid=rs.getInt(1);
                String artist=rs.getString(2);
                String episodes=rs.getString(3);
                String podcastname=rs.getString(4);
                String filepath=rs.getString(5);
                int pid=rs.getInt(6);
                Podcast obj2=new Podcast(podid,artist,episodes,podcastname,filepath,pid);
                podcastList3.add(obj2);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return podcastList3;
    }
}
