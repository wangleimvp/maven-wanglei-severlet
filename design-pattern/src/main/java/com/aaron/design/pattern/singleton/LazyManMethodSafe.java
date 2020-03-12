package com.aaron.design.pattern.singleton;

/**
 * Author wanglei
 * Created on 2020-03-12
 */
public class LazyManMethodSafe {

    private LazyManMethodSafe() {
    }

    private static LazyManMethodSafe instance;

    public static synchronized LazyManMethodSafe getInstance() {
        if (instance == null) {
                instance = new LazyManMethodSafe();
        }
        return instance;
    }
}
