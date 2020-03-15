package com.aaron.design.pattern.behavioral.command;

/**
 * Author wanglei
 * Created on 2020-03-15
 */
public class ConcreteCommandA implements Command {

    private ReceiverA receiver;

    public ConcreteCommandA(){
        receiver = new ReceiverA();
    }

    @Override
    public void execute() {
        System.out.println("发送命令A给接收者");
        receiver.action();
    }
}
