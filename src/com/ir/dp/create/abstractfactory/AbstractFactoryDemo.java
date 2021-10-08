package com.ir.dp.create.abstractfactory;

import com.ir.dp.create.abstractfactory.core.*;

/**
 * @author i-rain
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color red = colorFactory.getColor("RED");
        red.fill();

        Color blue = colorFactory.getColor("BLUE");
        blue.fill();

        Color green = colorFactory.getColor("GREEN");
        green.fill();
    }
}
