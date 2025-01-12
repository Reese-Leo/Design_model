package com.example.desginpattern.ProxyDesign.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author : lijingcan1
 * @date 2025/1/9 21:05
 * 代理类
 **/
public class JdkProxyHandler implements InvocationHandler {
    // cache for users
    private Map<Integer, User> userCache;
    private Object targetObject;

    public JdkProxyHandler(Object targetObject) {
        this.targetObject = targetObject;
        this.userCache = new ConcurrentHashMap<>();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (userCache.containsKey(args[0])) {
            System.out.println("Get from cache..");
            return userCache.get(args[0]);
        }
        // execute targetObject.getUserById()
        Object cacheUser = method.invoke(targetObject, args);
        // add to cache
        userCache.put((Integer) args[0],(User) cacheUser);
        return cacheUser;
    }
}

