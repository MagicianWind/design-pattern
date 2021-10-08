package com.ir.dp.structure.bridge.core;

/**
 * @author i-rain
 */
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("green circle: " + radius + "-" + x + "-" + y);
    }
}
