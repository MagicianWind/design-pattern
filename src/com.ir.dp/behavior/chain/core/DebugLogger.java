package com.ir.dp.behavior.chain.core;

/**
 * @author i-rain
 */
public class DebugLogger extends AbstractLogger {

    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("debug-logger: " + message);
    }
}
