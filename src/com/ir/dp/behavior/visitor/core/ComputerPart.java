package com.ir.dp.behavior.visitor.core;

/**
 * @author i-rain
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);
}
