package com.aaron.design.pattern.behavioral.memento;

/**
 * Author wanglei
 * Created on 2020-03-20
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
