package com.aaron.design.pattern.behavioral.command;

/**
 * Author wanglei
 * Created on 2020-03-15
 */
public class Invoker {

    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call(){
        command.execute();
    }
}
