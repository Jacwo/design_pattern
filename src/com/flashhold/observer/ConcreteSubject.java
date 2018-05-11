package com.flashhold.observer;

public class ConcreteSubject extends Subject {
    @Override
    public void doSomething() {
        System.out.println("被观察者事件反生");
        this.notifyObserver();
    }
}
