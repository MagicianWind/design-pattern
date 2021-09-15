package com.ir.dp.behavior.observer.core;

/**
 * @author i-rain
 */
public class OrangeObserver extends AbstractObserver {

    public OrangeObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("orange get: " + subject.getState());
    }
}
