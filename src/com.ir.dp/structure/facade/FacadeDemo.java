package com.ir.dp.structure.facade;

import com.ir.dp.structure.facade.core.ShapeMaker;

/**
 * @author i-rain
 */
public class FacadeDemo {

    public static void main(String[] args) {

        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectAngle();
    }
}
