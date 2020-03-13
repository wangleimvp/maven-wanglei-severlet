package com.aaron.design.pattern.structural.decorator;

/**
 * Author wanglei
 * Created on 2020-03-13
 */
public class Decorator implements Component {

    private Component component;

    Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
