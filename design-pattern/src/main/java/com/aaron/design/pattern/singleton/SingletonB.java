package com.aaron.design.pattern.singleton;

/**
 * Author wanglei
 * Created on 17-5-17
 */
public class SingletonB {

    private static class SingletonHolder {
        private static final SingletonB INSTANCE = new SingletonB();
    }

    public static SingletonB getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
