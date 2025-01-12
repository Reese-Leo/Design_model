package com.example.desginpattern.ProxyDesign.CGLIB;

/**
 * @author : lijingcan1
 * @date 2025/1/12 13:03
 **/
public class Client {
    public static void main(String[] args) {
        Target proxyObject = (Target) CglibProxyFactory.getCglibProxy(new Target());
        // The first time: get from database & storage it in cache
        proxyObject.getUserById(1);
        // The second time: get from cache
        proxyObject.getUserById(1);
    }
}

