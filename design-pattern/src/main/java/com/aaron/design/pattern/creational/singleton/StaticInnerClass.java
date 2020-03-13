package com.aaron.design.pattern.creational.singleton;

/**
 * Author wanglei
 * Created on 2020-3-12
 * 利用了静态类的懒加载，和类加载线程同步
 */
public class StaticInnerClass {

    private StaticInnerClass() {
    }

    private static class SingletonHolder {
        private static final StaticInnerClass INSTANCE = new StaticInnerClass();
    }

    public static StaticInnerClass getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
