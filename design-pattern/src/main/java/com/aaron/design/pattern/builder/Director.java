package com.aaron.design.pattern.builder;

/**
 * Author wanglei
 * Created on 2020-03-12
 */
public class Director {

    private AbstractBuilder builder;

    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getProduct();
    }

}
