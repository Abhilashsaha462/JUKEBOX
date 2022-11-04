package org.example.Model;

public class Podcast {
    private int podid;
    private String artist;
    private String episodes;
    private String podcastname;
    private String filepath;
    private int pid;

    public Podcast(int podid, String artist, String episodes, String podcastname, String filepath, int pid) {
        this.podid = podid;
        this.artist = artist;
        this.episodes = episodes;
        this.podcastname = podcastname;
        this.filepath = filepath;
        this.pid = pid;
    }

    public int getPodid() {
        return podid;
    }

    public void setPodid(int podid) {
        this.podid = podid;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getEpisodes() {
        return episodes;
    }

    public void setEpisodes(String episodes) {
        this.episodes = episodes;
    }

    public String getPodcastname() {
        return podcastname;
    }

    public void setPodcastname(String podcastname) {
        this.podcastname = podcastname;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "podid=" + podid +
                ", artist='" + artist + '\'' +
                ", episodes='" + episodes + '\'' +
                ", podcastname='" + podcastname + '\'' +
                ", filepath='" + filepath + '\'' +
                ", pid=" + pid +
                '}';
    }
}
