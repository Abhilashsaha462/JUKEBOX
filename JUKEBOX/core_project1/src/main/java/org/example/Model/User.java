package org.example.Model;

public class User {
    private String userid;
    private String password;
    private long mobno;

public User(String userid, String password, long mobno ) {

    this.userid= userid;
    this.password= password;
    this.mobno =  mobno;
}

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getMobno() {
        return mobno;
    }

    public void setMobno(long mobno) {
        this.mobno = mobno;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", password=" + password +
                ", mobno=" + mobno +
                '}';
    }
}
