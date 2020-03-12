package com.aaron.design.pattern.builder;

/**
 * Author wanglei
 * Created on 2020-03-12
 */
public abstract class AbstractBuilder {

    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public Product getProduct(){
        return product;
    }

}
