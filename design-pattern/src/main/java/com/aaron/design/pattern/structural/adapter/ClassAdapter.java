package com.aaron.design.pattern.structural.adapter;

/**
 * Author wanglei
 * Created on 2020-03-13
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
