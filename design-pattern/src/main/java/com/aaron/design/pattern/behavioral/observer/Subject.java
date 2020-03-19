package com.aaron.design.pattern.behavioral.observer;

import java.util.*;

public abstract class Subject {

    protected List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public abstract void notifyObserver();

}
