package com.aaron.design.pattern.builder;

/**
 * Author wanglei
 * Created on 2020-03-12
 */
public class ConcreteBuilder1 extends AbstractBuilder {

    @Override
    public void buildPartA() {
        product.setPartA("ConcreteBuilder1 build partA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("ConcreteBuilder1 build partB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("ConcreteBuilder1 build partC");
    }
}
