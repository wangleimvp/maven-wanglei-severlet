package com.aaron.design.pattern.singleton;

/**
 * Author wanglei
 * Created on 17-5-17
 */
public class HungryManStaticConstant {

    private HungryManStaticConstant() {
    }

    private static final HungryManStaticConstant instance = new HungryManStaticConstant();

    public static HungryManStaticConstant getInstance() {
        return instance;
    }
}
