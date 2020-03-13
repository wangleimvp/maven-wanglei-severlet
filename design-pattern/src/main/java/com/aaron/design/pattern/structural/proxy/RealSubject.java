package com.aaron.design.pattern.structural.proxy;

/**
 * Author wanglei
 * Created on 2020-03-13
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("访问真实主题方法...");
    }
}
