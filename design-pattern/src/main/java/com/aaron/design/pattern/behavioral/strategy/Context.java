package com.aaron.design.pattern.behavioral.strategy;

/**
 * Author wanglei
 * Created on 2020-03-15
 */
public class Context {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod(){
        strategy.strategyMethod();
    }
}
