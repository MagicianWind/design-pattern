package com.ir.dp.behavior.visitor;

import com.ir.dp.behavior.visitor.core.Computer;
import com.ir.dp.behavior.visitor.core.ComputerPartDisplayVisitor;

/**
 * @author i-rain
 */
public class VisitorDemo {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
