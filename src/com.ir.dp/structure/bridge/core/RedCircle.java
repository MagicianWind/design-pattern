package com.ir.dp.structure.bridge.core;

/**
 * @author i-rain
 */
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("red circle: " + radius + "-" + x + "-" + y);
    }
}
