package com.ir.dp.create.builder.core;

/**
 * @author i-rain
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
