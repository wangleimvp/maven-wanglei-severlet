package com.aaron.design.pattern.singleton;

/**
 * Author wanglei
 * Created on 17-5-17
 */
public class SingletonA {

    private static SingletonA singleton = new SingletonA();

    public static SingletonA getInstance() {
        return singleton;
    }
}
