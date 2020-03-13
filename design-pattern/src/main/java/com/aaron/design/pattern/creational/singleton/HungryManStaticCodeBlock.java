package com.aaron.design.pattern.creational.singleton;

/**
 * Author wanglei
 * Created on 2020-03-12
 */
public class HungryManStaticCodeBlock {

    private HungryManStaticCodeBlock() {
    }

    private static HungryManStaticCodeBlock instance;

    static {
        instance = new HungryManStaticCodeBlock();
    }

    public static HungryManStaticCodeBlock getInstance() {
        return instance;
    }
}

