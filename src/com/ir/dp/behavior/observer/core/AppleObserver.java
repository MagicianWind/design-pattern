package com.ir.dp.behavior.observer.core;

/**
 * @author i-rain
 */
public class AppleObserver extends AbstractObserver {

    public AppleObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("apple get: " + subject.getState());
    }
}
