package com.ir.dp.behavior.mediator;

import com.ir.dp.behavior.mediator.core.User;

/**
 * @author i-rain
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User yu = new User("yu");
        yu.sendMessage("hello everybody");

        User iu = new User("iu");
        iu.sendMessage("hello");
    }
}
