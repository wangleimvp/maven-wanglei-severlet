package com.aaron.design.pattern.singleton;

/**
 * Author wanglei
 * Created on 2020-03-12
 */
public class LazyManCodeBlockSafe {

    private LazyManCodeBlockSafe() {
    }

    private static LazyManCodeBlockSafe instance;

    public static LazyManCodeBlockSafe getInstance() {
        if (instance == null) {
            synchronized(LazyManCodeBlockSafe.class){
                instance = new LazyManCodeBlockSafe();
            }
        }
        return instance;
    }
}
