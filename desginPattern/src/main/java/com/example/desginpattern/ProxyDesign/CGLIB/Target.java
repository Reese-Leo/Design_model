package com.example.desginpattern.ProxyDesign.CGLIB;

/**
 * @author : lijingcan1
 * @date 2025/1/12 10:50
 * 1
 **/
public class Target {
    public User getUserById(int id) {
        User user = new User(id);
        System.out.println("Get " + user + " from database...");
        return user;
    }
}

