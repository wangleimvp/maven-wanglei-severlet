package com.aaron.design.pattern.creational.prototype;

/**
 * Author wanglei
 * Created on 2020-03-12
 */
public interface Shape extends Cloneable {

    Shape clone ();

    void countArea();

}
