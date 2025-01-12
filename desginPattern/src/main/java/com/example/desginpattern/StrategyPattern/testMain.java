package com.example.desginpattern.StrategyPattern;

import jakarta.annotation.Resource;

/**
 * Author : lijingcan1
 * desc:
 *
 * @Date 2024/12/12 16:45
 **/

public class testMain {


    public static void main(String[] args) {
        HcStrategy hcStrategy = new HcStrategy();
        KcStrategy kcStrategy = new KcStrategy();
        StrageContext strageContext1 = new StrageContext(hcStrategy);
        StrageContext strageContext2 = new StrageContext(kcStrategy);
        System.out.println(strageContext1.getPrice(10));
        System.out.println(strageContext2.getPrice(20));
    }
}
