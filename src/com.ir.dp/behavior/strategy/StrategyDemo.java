package com.ir.dp.behavior.strategy;

import com.ir.dp.behavior.strategy.core.AddStrategy;
import com.ir.dp.behavior.strategy.core.Context;
import com.ir.dp.behavior.strategy.core.SubtractStrategy;

/**
 * @author i-rain
 */
public class StrategyDemo {

    public static void main(String[] args) {
        Context context = new Context(new AddStrategy());
        context.execute(1, 2);

        context = new Context(new SubtractStrategy());
        context.execute(1, 2);
    }
}
