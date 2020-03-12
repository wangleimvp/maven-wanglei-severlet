package com.aaron.design.pattern.singleton;

/**
 * Author wanglei
 * Created on 2020-03-12
 */
public class HungryManStaticConstant {

    private HungryManStaticConstant() {
    }

    private static final HungryManStaticConstant instance = new HungryManStaticConstant();

    public static HungryManStaticConstant getInstance() {
        return instance;
    }
}
