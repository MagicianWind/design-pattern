package com.ir.dp.behavior.visitor.core;

/**
 * @author i-rain
 */
public interface ComputerPartVisitor {

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

    void visit(Computer computer);
}
