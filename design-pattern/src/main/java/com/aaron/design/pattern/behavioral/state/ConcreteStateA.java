package com.aaron.design.pattern.behavioral.state;

/**
 * Author wanglei
 * Created on 2020-03-16
 */
public class ConcreteStateA extends State {
    @Override
    public void handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}
