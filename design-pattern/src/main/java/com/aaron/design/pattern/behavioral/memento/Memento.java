package com.aaron.design.pattern.behavioral.memento;

/**
 * Author wanglei
 * Created on 2020-03-20
 */
public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
