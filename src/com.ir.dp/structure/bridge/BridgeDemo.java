package com.ir.dp.structure.bridge;

import com.ir.dp.structure.bridge.core.Circle;
import com.ir.dp.structure.bridge.core.GreenCircle;
import com.ir.dp.structure.bridge.core.RedCircle;
import com.ir.dp.structure.bridge.core.Shape;

/**
 * @author i-rain
 */
public class BridgeDemo {

    public static void main(String[] args) {
        Shape shape = new Circle(new GreenCircle(), 1, 1, 1);
        shape.draw();

        shape = new Circle(new RedCircle(), 2, 2, 2);
        shape.draw();
    }
}
