package com.aaron.design.pattern.factory.other;

/**
 * Author wanglei
 * Created on 2020-03-12
 */
public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public Product1 newProduct1() {
        System.out.println("具体工厂2生成-->具体产品12...");
        return new ConcreteProduct12();
    }

    @Override
    public Product2 newProduct2() {
        System.out.println("具体工厂2生成-->具体产品22...");
        return new ConcreteProduct22();
    }
}
