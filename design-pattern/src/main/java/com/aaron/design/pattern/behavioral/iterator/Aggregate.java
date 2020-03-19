package com.aaron.design.pattern.behavioral.iterator;

/**
 * Author wanglei
 * Created on 2020-03-19
 */
public interface Aggregate {

    void add(Object obj);

    void remove(Object obj);

    Iterator getIterator();
}
