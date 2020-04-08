package com.aaron.spi;

/**
 * Author wanglei
 * Created on 2020-04-08
 */
public class Bumblebee implements Robot {
    @Override
    public void sayHello() {
        System.out.println("Hello, I am Bumblebee.");
    }
}
