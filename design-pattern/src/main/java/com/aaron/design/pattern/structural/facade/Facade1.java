package com.aaron.design.pattern.structural.facade;

/**
 * Author wanglei
 * Created on 2020-03-13
 */
public class Facade1 implements AbstractFacade {

    private SubSystem1 subSystem1 = new SubSystem1();
    private SubSystem2 subSystem2 = new SubSystem2();
    private SubSystem3 subSystem3 = new SubSystem3();

    @Override
    public void method1() {
        subSystem1.method1();
        subSystem2.method2();
    }

    @Override
    public void method2() {
        subSystem3.method3();
    }
}
