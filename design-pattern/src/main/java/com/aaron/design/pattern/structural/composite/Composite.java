package com.aaron.design.pattern.structural.composite;

import java.util.ArrayList;

/**
 * Author wanglei
 * Created on 2020-03-13
 */
public class Composite implements Component {

    private ArrayList<Component> children = new ArrayList<Component>();

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for (Component c : children) {
            c.operation();
        }
    }
}
