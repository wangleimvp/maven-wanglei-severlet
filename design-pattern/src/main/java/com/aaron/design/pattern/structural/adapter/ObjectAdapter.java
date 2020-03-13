package com.aaron.design.pattern.structural.adapter;

import com.google.inject.internal.cglib.core.$AbstractClassGenerator;

/**
 * Author wanglei
 * Created on 2020-03-13
 */
public class ObjectAdapter implements Target {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
