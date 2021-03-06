package com.ir.dp.behavior.visitor.core;

/**
 * @author i-rain
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Mouse mouse) {
        System.out.println("display mouse");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("display keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("display monitor");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("display computer");
    }
}
