package com.ir.dp.behavior.visitor.core;

/**
 * @author i-rain
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
