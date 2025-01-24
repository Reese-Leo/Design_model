package com.example.desginpattern.ProxyDesign.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author : lijingcan1
 * @date 2025/1/9 21:06
 * 1
 **/
public class JdkProxyFactory {
    public static Object getDynamicProxy(Object targetObj) {
        ClassLoader classLoader = JdkProxyFactory.class.getClassLoader();
        Class<?>[] interfaces = targetObj.getClass().getInterfaces();
        InvocationHandler handler = new JdkProxyHandler(targetObj);
        // return dynamic_proxy_object
        return Proxy.newProxyInstance(classLoader, interfaces, handler);

    }
}

