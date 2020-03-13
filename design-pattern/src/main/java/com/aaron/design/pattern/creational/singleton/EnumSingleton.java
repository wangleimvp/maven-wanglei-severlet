package com.aaron.design.pattern.creational.singleton;

/**
 * Author wanglei
 * Created on 2020-03-12
 * 能够保证线程同步，同时保证不被反序列化重新创建新的对象
 */
public enum EnumSingleton {
    INSTANCE;
    public void whateverMethod() {
        System.out.println("Enum Singleton");
    }
}

