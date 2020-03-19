package com.aaron.design.pattern.behavioral.mediator;

/**
 * Author wanglei
 * Created on 2020-03-19
 */
public abstract class Mediator {

    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague colleague);

}
