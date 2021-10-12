package com.ir.dp.create.single.core;

/**
 * 静态内部类
 *
 * @author i-rain
 */
public class Singleton5 {

    private Singleton5() {
    }

    private static class SingletonHolder {
        private static Singleton5 singleton5 = new Singleton5();
    }

    public static Singleton5 getInstance() {
        return SingletonHolder.singleton5;
    }
}
