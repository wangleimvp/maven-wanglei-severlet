package com.aaron.design.pattern.singleton;

/**
 * Author wanglei
 * Created on 17-5-17
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
