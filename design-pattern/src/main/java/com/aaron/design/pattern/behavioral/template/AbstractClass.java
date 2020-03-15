package com.aaron.design.pattern.behavioral.template;

import com.google.inject.internal.asm.$AnnotationVisitor;

/**
 * Author wanglei
 * Created on 2020-03-15
 */
public abstract class AbstractClass {

    //模板方法
    public void templateMethod() {
        abstractMethod1();
        HookMethod1();
        if (HookMethod2()) {
            specificMethod();
        }
        abstractMethod2();
    }

    //具体方法
    public void specificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }

    public void HookMethod1() {
    }  //钩子方法1

    public boolean HookMethod2() //钩子方法2
    {
        return true;
    }

    //抽象方法1
    public abstract void abstractMethod1();

    //抽象方法2
    public abstract void abstractMethod2();

}
