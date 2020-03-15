package com.aaron.design.pattern.behavioral.chain;

/**
 * Author wanglei
 * Created on 2020-03-15
 */
public abstract class Handler {

    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(String request);

}
