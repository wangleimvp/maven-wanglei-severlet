package com.aaron.design.pattern.behavioral.observer.event;

/**
 * Author wanglei
 * Created on 2020-03-19
 */
public class EventObject {

    private Object source;

    public EventObject(Object source){
        this.source = source;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }
}
