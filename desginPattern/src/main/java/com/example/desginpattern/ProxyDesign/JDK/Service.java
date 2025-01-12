package com.example.desginpattern.ProxyDesign.JDK;

/**
 * @author : lijingcan1
 * @date 2025/1/9 21:04
 * 被代理类
 **/
public class Service implements ServiceInterface{
    @Override
    public User getUserById(int id) {
        System.out.println("Get user from database..");
        // pretend to get from database
        return new User(1);
    }
}

