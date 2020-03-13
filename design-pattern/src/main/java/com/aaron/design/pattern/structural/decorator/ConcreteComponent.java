package com.aaron.design.pattern.structural.decorator;

/**
 * Author wanglei
 * Created on 2020-03-13
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
