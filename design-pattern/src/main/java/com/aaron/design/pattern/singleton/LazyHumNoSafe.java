package com.aaron.design.pattern.singleton;

/**
 * Author wanglei
 * Created on 2020-03-12
 */
public class LazyHumNoSafe {

    private LazyHumNoSafe() {
    }

    private static LazyHumNoSafe instance;

    public static LazyHumNoSafe getInstance() {
        if (instance == null) {
            instance = new LazyHumNoSafe();
        }
        return instance;
    }
}
