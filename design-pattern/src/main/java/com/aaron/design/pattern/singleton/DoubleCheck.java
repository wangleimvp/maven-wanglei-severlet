package com.aaron.design.pattern.singleton;

/**
 * Author wanglei
 * Created on 17-5-17
 */
public class DoubleCheck {

    private DoubleCheck() {
    }

    private static DoubleCheck instance;

    public static DoubleCheck getInstance() {
        if (instance == null) {
            synchronized(DoubleCheck.class){
                if (instance == null){
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
