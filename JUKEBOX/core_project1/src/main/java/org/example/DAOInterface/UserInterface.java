package org.example.DAOInterface;

import org.example.Model.User;

import java.util.List;

public interface UserInterface {
     boolean createAccount(String userId, String password, long mobno);

     boolean loginAccount(String userid, String password);

}
