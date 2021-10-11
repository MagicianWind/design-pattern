package com.ir.dp.create.prototype;

import com.ir.dp.create.prototype.core.Shape;
import com.ir.dp.create.prototype.core.ShapeCache;

/**
 * @author i-rain
 */
public class ProtoTypeDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape circle = ShapeCache.getShape("1");
        System.out.println(circle.getType());
        Shape square = ShapeCache.getShape("2");
        System.out.println(square.getType());
        Shape rectangle = ShapeCache.getShape("3");
        System.out.println(rectangle.getType());
    }
}
