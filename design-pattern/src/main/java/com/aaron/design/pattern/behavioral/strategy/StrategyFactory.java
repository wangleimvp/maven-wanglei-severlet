package com.aaron.design.pattern.behavioral.strategy;

import java.util.HashMap;

/**
 * Author wanglei
 * Created on 2020-03-15
 */
public class StrategyFactory {

    private static HashMap<String, Strategy> strategies = new HashMap<>();

    public static void put(String key, Strategy strategy){
        strategies.put(key, strategy);
    }

    public static Strategy get(String key){
        return strategies.get(key);
    }

    public static void strategyMethod(String key){
        Strategy strategy = get(key);
        if (strategy == null){
            System.out.println("策略 " + key+ " 没有在策略工厂中");
            return;
        }
        strategy.strategyMethod();
    }

}
