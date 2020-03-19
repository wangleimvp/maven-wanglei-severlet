package com.aaron.design.pattern.behavioral.visitor;

/**
 * Author wanglei
 * Created on 2020-03-19
 */
public interface Element {
    void accept(Visitor visitor);
}
