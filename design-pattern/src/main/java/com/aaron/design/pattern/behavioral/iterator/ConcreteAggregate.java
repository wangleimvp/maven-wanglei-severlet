package com.aaron.design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Author wanglei
 * Created on 2020-03-19
 */
public class ConcreteAggregate implements Aggregate {

    private List<Object> list = new ArrayList<Object>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(list);
    }
}
