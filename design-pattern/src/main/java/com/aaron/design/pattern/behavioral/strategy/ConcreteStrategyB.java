package com.aaron.design.pattern.behavioral.strategy;

/**
 * Author wanglei
 * Created on 2020-03-15
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}
