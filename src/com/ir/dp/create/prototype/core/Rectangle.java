package com.ir.dp.create.prototype.core;

/**
 * @author i-rain
 */
public class Rectangle extends Shape {

    public Rectangle() {
        this.type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("draw Rectangle");
    }
}
