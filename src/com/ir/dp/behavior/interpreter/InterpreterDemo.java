package com.ir.dp.behavior.interpreter;

import com.ir.dp.behavior.interpreter.core.OrExpression;
import com.ir.dp.behavior.interpreter.core.TerminalExpression;
import com.ir.dp.behavior.interpreter.core.AndExpression;

/**
 * @author i-rain
 */
public class InterpreterDemo {

    public static void main(String[] args) {
        TerminalExpression terminalExpression1 = new TerminalExpression("123");
        TerminalExpression terminalExpression2 = new TerminalExpression("123");
        TerminalExpression terminalExpression3 = new TerminalExpression("456");

        AndExpression andExpression = new AndExpression(terminalExpression1, terminalExpression2);
        System.out.println(andExpression.interpret("123"));

        OrExpression orExpression = new OrExpression(terminalExpression1, terminalExpression3);
        System.out.println(orExpression.interpret("456"));
    }
}
