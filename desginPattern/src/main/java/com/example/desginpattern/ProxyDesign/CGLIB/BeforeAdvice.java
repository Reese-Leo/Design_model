package com.example.desginpattern.ProxyDesign.CGLIB;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author : lijingcan1
 * @date 2025/1/12 13:01
 **/
public class BeforeAdvice implements Before {
    private static Map<Integer, User> caching = new ConcurrentHashMap<>();

    public static Map<Integer, User> getCaching() {
        return caching;
    }

    @Override
    public Object before(Object[] args) {
        if (args == null)
            return null;
        // in default, the first arg is key
        int keyId = (int) args[0];
        // find the cache object
        if (caching.containsKey(keyId)) {
            User cachedUser = caching.get(keyId);
            System.out.println("Get " + cachedUser + " from cache...");
            return cachedUser;
        }
        // can't find the cache object
        return null;
    }
}
