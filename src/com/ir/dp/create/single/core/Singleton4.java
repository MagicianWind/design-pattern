package com.ir.dp.create.single.core;

/**
 * DCL双检锁
 *
 * @author i-rain
 */
public class Singleton4 {

    // new操作是非原子操作 使用volatile防止new对象指令重排序 (分配内存 对象初始化 instance指向该内存)
    private volatile static Singleton4 singleton4;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (singleton4 == null) {
            synchronized (Singleton4.class) {
                if (singleton4 == null) {
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }
}