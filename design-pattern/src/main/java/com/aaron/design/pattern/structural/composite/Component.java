package com.aaron.design.pattern.structural.composite;

/**
 * Author wanglei
 * Created on 2020-03-13
 */
public interface Component {
    void add(Component c);
    void remove(Component c);
    Component getChild(int i);
    void operation();
}
