package com.ir.dp.create.single;

import com.ir.dp.create.single.core.Singleton6;

/**
 * @author i-rain
 */
public class SingletonDemo {

    public static void main(String[] args) {
        Singleton6[] values = Singleton6.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}