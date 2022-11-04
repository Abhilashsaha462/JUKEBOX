package org.example.Model;

public class Playlist {
    private int playlistid;
    private String playlistname;
    private String userid;

    public Playlist(int playlistid, String playlistname, String userid) {
        this.playlistid = playlistid;
        this.playlistname = playlistname;
        this.userid = userid;
    }

    public int getPlaylistid() {
        return playlistid;
    }

    public void setPlaylistid(int playlistid) {
        this.playlistid = playlistid;
    }

    public String getPlaylistname() {
        return playlistname;
    }

    public void setPlaylistname(String playlistname) {
        this.playlistname = playlistname;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "playlistid=" + playlistid +
                ", playlistname='" + playlistname + '\'' +
                ", userid=" + userid +
                '}';
    }
}
