package com.aaron.design.pattern.behavioral.observer;

public class ConcreteSubject extends Subject {

    @Override
    public void notifyObserver(){

        System.out.println("具体目标发生改变...");
        System.out.println("--------------");

        for (Observer observer: observers){
            observer.response();
        }
    }

}
