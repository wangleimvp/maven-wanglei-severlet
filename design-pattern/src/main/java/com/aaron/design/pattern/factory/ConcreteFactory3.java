package com.aaron.design.pattern.factory;

/**
 * Author wanglei
 * Created on 2020-03-12
 */
public class ConcreteFactory3 {

    public Product newProduct1() {
        System.out.println("具体工厂3生成-->具体产品1...");
        return new ConcreteProduct1();
    }

    public  Product newProduct2() {
        System.out.println("具体工厂3生成-->具体产品2...");
        return new ConcreteProduct2();
    }
}
