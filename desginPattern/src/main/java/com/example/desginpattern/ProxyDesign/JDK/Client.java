package com.example.desginpattern.ProxyDesign.JDK;

/**
 * @author : lijingcan1
 * @date 2025/1/9 21:07
 * 1
 **/
public class Client {
    public static void main(String[] args) {
        ServiceInterface realService = new Service();
        ServiceInterface dynamicProxyObject = (ServiceInterface) JdkProxyFactory.getDynamicProxy(realService);

        dynamicProxyObject.getUserById(1);
        dynamicProxyObject.getUserById(1);
    }
}
