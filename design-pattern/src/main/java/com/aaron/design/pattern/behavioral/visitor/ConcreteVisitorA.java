package com.aaron.design.pattern.behavioral.visitor;

/**
 * Author wanglei
 * Created on 2020-03-19
 */
public class ConcreteVisitorA implements Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("具体访问者A访问-->" + elementA.operationA());
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("具体访问者A访问-->" + elementB.operationB());
    }
}
