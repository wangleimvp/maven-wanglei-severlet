package com.aaron.design.pattern.creational.factory;

/**
 * Author wanglei
 * Created on 2020-03-12
 */
public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂2生成-->具体产品2...");
        return new ConcreteProduct2();
    }
}
