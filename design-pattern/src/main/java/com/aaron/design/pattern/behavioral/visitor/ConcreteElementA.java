package com.aaron.design.pattern.behavioral.visitor;

/**
 * Author wanglei
 * Created on 2020-03-19
 */
public class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "具体元素A的操作。";
    }
}
