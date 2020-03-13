package com.aaron.design.pattern.structural.decorator;

/**
 * Author wanglei
 * Created on 2020-03-13
 */
public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        addedFunction();
    }

    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()-1");
    }
}
