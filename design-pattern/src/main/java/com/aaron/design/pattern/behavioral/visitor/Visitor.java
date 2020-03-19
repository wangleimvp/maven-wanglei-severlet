package com.aaron.design.pattern.behavioral.visitor;

/**
 * Author wanglei
 * Created on 2020-03-19
 */
public interface Visitor {

    void visit(ConcreteElementA elementA);

    void visit(ConcreteElementB elementB);
}
