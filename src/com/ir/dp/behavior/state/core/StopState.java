package com.ir.dp.behavior.state.core;

/**
 * @author i-rain
 */
public class StopState implements State {

    @Override
    public void execution(Context context) {
        System.out.println("execution stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "stop state";
    }
}
