package com.ir.dp.structure.flyweight;

import com.ir.dp.structure.flyweight.core.ShapeFactory;
import com.ir.dp.structure.flyweight.core.Circle;

/**
 * @author i-rain
 */
public class FlyweightDemo {

    private static final String[] COLORS = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return COLORS[(int) (Math.random() * 5)];
    }

    private static int getRandomX() {
        return (int)(Math.random() * 100);
    }

    private static int getRandomY() {
        return (int)(Math.random() * 100);
    }
}
