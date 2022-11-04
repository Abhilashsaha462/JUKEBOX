package org.example.DAOImplClasses;

import org.example.DAOInterface.UserInterface;
import org.example.DBConnection;
import org.example.Model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserImpl implements UserInterface
{
    static Connection connection = DBConnection.getConnection();
    @Override
    public boolean createAccount(String userid, String password, long mobno)
    {
        try
        {
            if (userid == null || password == null)
            {
                System.out.println("All Field Required!");
                return false;
            }
            String sql = "insert into  User (userid ,password ,mobno) values (?,?,?)";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1,userid);
            st.setString(2,password);
            st.setLong(3,mobno);
            int rows = st.executeUpdate();
            System.out.println("Inserted Successfully");
            return true;
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
        return false;
    }
    @Override
    public boolean loginAccount(String userid, String password)
    {
        try
        {
            if (userid == null || password == null)
            {
                System.out.println("All Field Required!");
                return false;
            }
            String sql1 = "select * from User where userid= ? and password= ?";
            PreparedStatement st1 = connection.prepareStatement(sql1);
            st1.setString(1,userid);
            st1.setString(2,password);
            ResultSet rows = st1.executeQuery();
            if(rows.next()){
            System.out.println("Login Successfully");
            return true;}
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
        return false;
    }
}