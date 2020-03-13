package com.aaron.design.pattern.structural.flyweight;

/**
 * Author wanglei
 * Created on 2020-03-13
 */
public class UnsharedConcreteFlyweight {
    private String info;
    public UnsharedConcreteFlyweight(String info){
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
