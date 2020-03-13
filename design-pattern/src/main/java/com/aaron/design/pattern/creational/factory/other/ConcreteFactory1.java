package com.aaron.design.pattern.creational.factory.other;

/**
 * Author wanglei
 * Created on 2020-03-12
 */
public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public Product1 newProduct1() {
        System.out.println("具体工厂1生成-->具体产品11...");
        return new ConcreteProduct11();
    }

    @Override
    public Product2 newProduct2() {
        System.out.println("具体工厂1生成-->具体产品21...");
        return new ConcreteProduct21();
    }
}
