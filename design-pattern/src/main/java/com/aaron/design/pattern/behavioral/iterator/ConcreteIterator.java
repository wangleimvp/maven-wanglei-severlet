package com.aaron.design.pattern.behavioral.iterator;

import java.util.List;

/**
 * Author wanglei
 * Created on 2020-03-19
 */
public class ConcreteIterator implements Iterator {

    private List<Object> list;
    private int index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        return list.get(index);
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = list.get(++index);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        return index < list.size() - 1;
    }
}
