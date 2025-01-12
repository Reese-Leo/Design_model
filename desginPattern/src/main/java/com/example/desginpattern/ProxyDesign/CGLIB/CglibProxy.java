package com.example.desginpattern.ProxyDesign.CGLIB;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author : lijingcan1
 * @date 2025/1/12 13:02
 **/
public class CglibProxy implements MethodInterceptor {
    private Object targetObject;
    private Before beforeAdvice;
    private After afterAdvice;

    public CglibProxy(Object targetObject, Before before, After after) {
        this.targetObject = targetObject;
        this.beforeAdvice = before;
        this.afterAdvice = after;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object obj = null;
        if (beforeAdvice != null) {
            obj = beforeAdvice.before(args);
            // get 'obj' from cache
            if (obj != null) {
                return obj;
            }
        }
        // get 'obj' from database
        obj = method.invoke(targetObject, args);
        if (afterAdvice != null) {
            // storage the 'obj' in cache for next search
            afterAdvice.after(args[0], obj);
        }
        // return the database_obj
        return obj;
    }
}
