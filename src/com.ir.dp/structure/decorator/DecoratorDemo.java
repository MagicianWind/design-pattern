package com.ir.dp.structure.decorator;

import com.ir.dp.structure.decorator.core.AbstractShapeDecorator;
import com.ir.dp.structure.decorator.core.Rectangle;
import com.ir.dp.structure.decorator.core.Circle;
import com.ir.dp.structure.decorator.core.ReadShapeDecorator;

/**
 * @author i-rain
 */
public class DecoratorDemo {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.draw();

        AbstractShapeDecorator shapeDecorator = new ReadShapeDecorator(circle);
        shapeDecorator.draw();

        shapeDecorator = new ReadShapeDecorator(rectangle);
        shapeDecorator.draw();
    }
}
