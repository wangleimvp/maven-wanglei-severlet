package com.aaron.design.pattern.behavioral.mediator;

/**
 * Author wanglei
 * Created on 2020-03-19
 */
public abstract class Colleague {

    protected Mediator mediator;

    public abstract void receive();

    public abstract void send();

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
