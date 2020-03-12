package com.aaron.design.pattern.builder;

/**
 * Author wanglei
 * Created on 2020-03-12
 */
public class ConcreteBuilder2 extends AbstractBuilder {

    @Override
    public void buildPartA() {
        product.setPartA("ConcreteBuilder2 build partA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("ConcreteBuilder2 build partB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("ConcreteBuilder2 build partC");
    }
}
