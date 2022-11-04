package org.example.Model;

public class Songs {
    private int songid;
    private String artist;
    private String genre;
    private String songname;
    private String language;
    private String filepath;
    private int pid;

    public Songs(int songid, String artist, String genre, String songname, String language, String filepath, int pid) {
        this.songid = songid;
        this.artist = artist;
        this.genre = genre;
        this.songname = songname;
        this.language = language;
        this.filepath = filepath;
        this.pid = pid;
    }

    public int getSongid() {
        return songid;
    }

    public void setSongid(int songid) {
        this.songid = songid;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSongname() {
        return songname;
    }

    public void setSongname(String songname) {
        this.songname = songname;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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
        return "Songs{" +
                "songid=" + songid +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", songname='" + songname + '\'' +
                ", language='" + language + '\'' +
                ", filepath='" + filepath + '\'' +
                ", pid=" + pid +
                '}';
    }
}

