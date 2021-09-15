package com.ir.dp.behavior.chain.core;

/**
 * @author i-rain
 */
public class InfoLogger extends AbstractLogger {

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("info-logger: " + message);
    }
}
