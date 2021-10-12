package com.ir.dp.create.builder.core;

/**
 * @author i-rain
 */
public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
