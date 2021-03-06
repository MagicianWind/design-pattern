package com.ir.dp.behavior.visitor.core;

/**
 * @author i-rain
 */
public class Computer implements ComputerPart {

    private ComputerPart[] computerParts = {new Mouse(), new Keyboard(), new Monitor()};

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart computerPart : computerParts) {
            computerPart.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
