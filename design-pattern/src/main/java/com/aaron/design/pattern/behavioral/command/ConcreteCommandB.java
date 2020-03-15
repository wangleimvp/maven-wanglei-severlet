package com.aaron.design.pattern.behavioral.command;

/**
 * Author wanglei
 * Created on 2020-03-15
 */
public class ConcreteCommandB implements Command {

    private ReceiverB receiver;

    public ConcreteCommandB(){
        receiver = new ReceiverB();
    }

    @Override
    public void execute() {
        System.out.println("发送命令B给接收者");
        receiver.action();
    }

}
