package com.ir.dp.structure.bridge.core;

/**
 * @author i-rain
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
