package com.aaron.design.pattern.behavioral.visitor;

/**
 * Author wanglei
 * Created on 2020-03-19
 */
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return "具体元素B的操作。";
    }
}
