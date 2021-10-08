package com.ir.dp.behavior.mediator.core;

import java.util.Date;

/**
 * @author i-rain
 */
public class ChatRoom {

    public static void sendMessage(User user, String msg) {
        System.out.println(new Date().toString()
                + " [" + user.getUsername() +"] : " + msg);
    }
}
