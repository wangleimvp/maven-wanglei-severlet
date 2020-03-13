package com.aaron.design.pattern.structural.flyweight;

import java.util.HashMap;

/**
 * Author wanglei
 * Created on 2020-03-13
 */
public class FlyweightFactory {

    private HashMap<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

    public Flyweight getConcreteFlyweight1(String key) {
        Flyweight flyweight = flyweights.get(key);
        if (flyweight != null) {
            System.out.println("具体享元1" + key + "已经存在，被成功获取！");
        } else {
            flyweight = new ConcreteFlyweight1(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }

    public Flyweight getConcreteFlyweight2(String key) {
        Flyweight flyweight = flyweights.get(key);
    if (flyweight != null) {
            System.out.println("具体享元2" + key + "已经存在，被成功获取！");
        } else {
            flyweight = new ConcreteFlyweight2(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}
