package com.aaron.design.pattern.singleton;

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

