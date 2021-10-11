package com.ir.dp.create.prototype.core;

/**
 * @author i-rain
 */
public class Square extends Shape {

    public Square() {
        this.type = "Square";
    }

    @Override
    void draw() {
        System.out.println("draw Square");
    }
}
