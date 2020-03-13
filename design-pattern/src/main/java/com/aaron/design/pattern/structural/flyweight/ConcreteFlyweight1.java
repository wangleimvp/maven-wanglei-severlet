package com.aaron.design.pattern.structural.flyweight;

/**
 * Author wanglei
 * Created on 2020-03-13
 */
public class ConcreteFlyweight1 implements Flyweight {

    private String key;

    public ConcreteFlyweight1(String key){
        this.key = key;
        System.out.println("具体享元1"+key+"被创建！");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight outState) {
        System.out.print("具体享元1"+key+"被调用，");
        System.out.println("非享元信息是:"+outState.getInfo());
    }
}
