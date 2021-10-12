package com.ir.dp.create.single.core;

/**
 * 懒汉式 线程安全
 *
 * @author i-rain
 */
public class Singleton2 {

    private static Singleton2 singleton2;

    private Singleton2() {
    }

    // synchronized保证可见性
    public static synchronized Singleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
