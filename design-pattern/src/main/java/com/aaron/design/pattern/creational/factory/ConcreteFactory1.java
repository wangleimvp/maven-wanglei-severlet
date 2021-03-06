package com.aaron.design.pattern.creational.factory;

/**
 * Author wanglei
 * Created on 2020-03-12
 */
public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProduct1();
    }
}
