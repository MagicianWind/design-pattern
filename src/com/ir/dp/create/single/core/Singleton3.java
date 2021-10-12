package com.ir.dp.create.single.core;

/**
 * 饿汉式
 *
 * @author i-rain
 */
public class Singleton3 {

    private static Singleton3 singleton3 = new Singleton3();

    public static Singleton3 getInstance() {
        return singleton3;
    }
}
