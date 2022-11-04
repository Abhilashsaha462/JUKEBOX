package org.example.Model;

public class PlaylistDetails {
    private int pid;
    private String pname;
    private int podcastid;
    private int playlistid;

    public PlaylistDetails(int pid, String pname, int podcastid, int playlistid) {
        this.pid = pid;
        this.pname = pname;
        this.podcastid = podcastid;
        this.playlistid = playlistid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPodcastid() {
        return podcastid;
    }

    public void setPodcastid(int podcastid) {
        this.podcastid = podcastid;
    }

    public int getPlaylistid() {
        return playlistid;
    }

    public void setPlaylistid(int playlistid) {
        this.playlistid = playlistid;
    }

    @Override
    public String toString() {
        return "PlaylistDetails{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", podcastid=" + podcastid +
                ", playlistid=" + playlistid +
                '}';
    }
}
