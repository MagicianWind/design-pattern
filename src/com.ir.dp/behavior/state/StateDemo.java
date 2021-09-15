package com.ir.dp.behavior.state;

import com.ir.dp.behavior.state.core.Context;
import com.ir.dp.behavior.state.core.StopState;
import com.ir.dp.behavior.state.core.StartState;

/**
 * @author i-rain
 */
public class StateDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.execution(context);
        System.out.println(context.getState());

        StopState stopState = new StopState();
        stopState.execution(context);
        System.out.println(context.getState());
    }
}

