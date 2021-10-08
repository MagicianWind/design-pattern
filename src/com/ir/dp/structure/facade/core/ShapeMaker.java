package com.ir.dp.structure.facade.core;

/**
 * @author i-rain
 */
public class ShapeMaker {

    private Circle circle;

    private Rectangle rectangle;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectAngle() {
        rectangle.draw();
    }
}
