package com.aaron.design.pattern.behavioral.state;

/**
 * Author wanglei
 * Created on 2020-03-16
 */
public class Context {

    private State state;

    public Context(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handle(){
        state.handle(this);
    }

}
