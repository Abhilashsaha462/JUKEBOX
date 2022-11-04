package org.example;

import java.sql.*;

public class DBConnection {
    public static Connection getConnection()
    {
        Connection con=null;
        try
        {
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/music","root","Sahasiem7#");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
}
