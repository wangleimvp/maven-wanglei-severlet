package com.aaron.design.pattern.singleton;

/**
 * Author wanglei
 * Created on 17-5-17
 * 利用了静态类的懒加载，和类构造器初始化的线程同步
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
