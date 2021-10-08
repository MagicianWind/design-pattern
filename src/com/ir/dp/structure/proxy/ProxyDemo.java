package com.ir.dp.structure.proxy;

import com.ir.dp.structure.proxy.core.Image;
import com.ir.dp.structure.proxy.core.ProxyImage;

/**
 * @author i-rain
 */
public class ProxyDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("io.image");
        image.display();
        image.display();
    }
}
