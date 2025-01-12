package com.example.desginpattern.StrategyPattern;

import org.springframework.stereotype.Service;

/**
 * Author : lijingcan1
 * desc:
 *
 * @Date 2024/12/12 16:40
 **/
@Service
public class HcStrategy implements PriceStrategy {

    @Override
    public double getPrice(double price) {
        return price*10;
    }
}
