package com.example.desginpattern.StrategyPattern;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author : lijingcan1
 * desc:
 *
 * @Date 2024/12/17 11:10
 **/
@Component
public class StrategyFactory implements ApplicationContextAware {
    private static Map<String, PriceStrategy> strategyMap;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, PriceStrategy> beansOfType = applicationContext.getBeansOfType(PriceStrategy.class);
//        beansOfType.forEach((k, v) -> {
//
//        }
    }

    public List<PriceStrategy> getStrategyList() {
        return null;
    }
}
