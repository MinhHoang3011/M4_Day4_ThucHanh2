package com.example.dao;

import com.example.model.Login;
import com.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(24);
        u1.setName("Hoang");
        u1.setAccount("MinhHoang");
        u1.setEmail("minhhoang301198@gmail.com");
        u1.setPassword("30111998");
        users.add(u1);
    }
    public static User checkLogin(Login login){
        for (User u: users){
            if (u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
