package com.ir.dp.structure.proxy.core;

/**
 * @author i-rain
 */
public class ProxyImage implements Image {

    private String fileName;

    private Reallmage reallmage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (reallmage == null) {
            reallmage = new Reallmage(fileName);
        }
        reallmage.display();
    }
}
