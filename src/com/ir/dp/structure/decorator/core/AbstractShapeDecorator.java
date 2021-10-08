package com.ir.dp.structure.decorator.core;

/**
 * @author i-rain
 */
public abstract class AbstractShapeDecorator implements Shape {

    protected Shape shape;

    public AbstractShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
