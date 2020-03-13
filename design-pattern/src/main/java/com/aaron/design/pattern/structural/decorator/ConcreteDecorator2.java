package com.aaron.design.pattern.structural.decorator;

/**
 * Author wanglei
 * Created on 2020-03-13
 */
public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        addedFunction();
    }

    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()-2");
    }
}
