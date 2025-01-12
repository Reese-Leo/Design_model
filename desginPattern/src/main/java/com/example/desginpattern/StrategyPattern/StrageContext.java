package com.example.desginpattern.StrategyPattern;

import com.example.desginpattern.StrategyPattern.PriceStrategy;
import org.springframework.stereotype.Component;

/**
 * Author : lijingcan1
 * desc:
 *
 * @Date 2024/12/12 16:43
 **/
@Component
public class StrageContext {

    private PriceStrategy priceStrategy;

    public StrageContext(PriceStrategy priceStrategy) {
        this.priceStrategy =priceStrategy;
    }

    public double getPrice(double price){
        return  priceStrategy.getPrice(price);
    }
}
