package com.aaron.design.pattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Author wanglei
 * Created on 2020-03-19
 */
public class ConcreteMediator extends Mediator {

    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague ob : colleagues) {
            if (!ob.equals(colleague)) {
                ob.receive();
            }
        }
    }
}
