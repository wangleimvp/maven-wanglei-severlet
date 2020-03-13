package com.aaron.design.pattern.structural.bridge;

/**
 * Author wanglei
 * Created on 2020-03-13
 */
public abstract class AbstractBag {

    protected Color color;

    public abstract String getName();

    public void setColor(Color color) {
        this.color = color;
    }
}
