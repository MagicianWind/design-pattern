package com.ir.dp.behavior.template.core;

/**
 * @author i-rain
 */
public abstract class Game {

    /**
     * 初始化
     */
    public abstract void initialize();
    /**
     * 开始
     */
    public abstract void start();
    /**
     * 结束
     */
    public abstract void end();

    public final void play() {
        initialize();
        start();
        end();
    }
}
