package com.example.desginpattern.ProxyDesign.CGLIB;


import org.springframework.cglib.proxy.Enhancer;

/**
 * @author : lijingcan1
 * @date 2025/1/12 13:03
 **/
public class CglibProxyFactory {
    public static Object getCglibProxy(Object target) {
        Enhancer enhancer = new Enhancer();
        // set Target as SuperClass
        enhancer.setSuperclass(target.getClass());
        // set callback function (which implements MethodInterceptor)
        enhancer.setCallback(new CglibProxy(target, new BeforeAdvice(), new AfterAdvice()));
        // create proxy object
        return enhancer.create();
    }
}

