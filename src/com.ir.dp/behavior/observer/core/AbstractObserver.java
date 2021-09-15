package com.ir.dp.behavior.observer.core;

/**
 * @author i-rain
 */
public abstract class AbstractObserver {

    protected Subject subject;

    public abstract void update();
}
