package com.aaron.design.pattern.behavioral.strategy;

/**
 * Author wanglei
 * Created on 2020-03-15
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");
    }
}
