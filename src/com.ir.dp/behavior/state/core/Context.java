package com.ir.dp.behavior.state.core;

/**
 * @author i-rain
 */
public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
