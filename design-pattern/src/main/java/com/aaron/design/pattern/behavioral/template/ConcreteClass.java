package com.aaron.design.pattern.behavioral.template;

/**
 * Author wanglei
 * Created on 2020-03-15
 */
public class ConcreteClass extends AbstractClass {

    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }

    public void HookMethod1() {
        System.out.println("钩子方法1被重写...");
    }

    public boolean HookMethod2() {
        return false;
    }
}
