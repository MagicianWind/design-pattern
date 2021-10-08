package com.ir.dp.create.factorymethod;

import com.ir.dp.create.factorymethod.core.Shape;
import com.ir.dp.create.factorymethod.core.ShapeFactory;

/**
 * @author i-rain
 */
public class FactoryMethodDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape square = shapeFactory.getShape("square");
        square.draw();
    }
}
