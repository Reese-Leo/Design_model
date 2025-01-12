package com.example.desginpattern.ProxyDesign.CGLIB;

/**
 * @author : lijingcan1
 * @date 2025/1/12 13:04
 **/
public class AfterAdvice implements After {
    @Override
    public void after(Object... args) {
        if (args == null)
            return;
        BeforeAdvice.getCaching().put((Integer) args[0], (User) args[1]);
    }
}
