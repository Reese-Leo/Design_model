package com.example.desginpattern.StrategyPattern;

import org.springframework.stereotype.Service;

/**
 * Author : lijingcan1
 * desc:
 *
 * @Date 2024/12/12 16:41
 **/
@Service
public class KcStrategy  implements PriceStrategy {

    @Override
    public double getPrice(double price) {
        return price *5;
    }
}
