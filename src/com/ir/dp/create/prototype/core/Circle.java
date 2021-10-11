package com.ir.dp.create.prototype.core;

/**
 * @author i-rain
 */
public class Circle extends Shape {

    public Circle() {
        this.type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("draw circle");
    }
}
