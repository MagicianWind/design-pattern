package com.ir.dp.behavior.mediator.core;

/**
 * @author i-rain
 */
public class User {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }

    public void sendMessage(String message) {
        ChatRoom.sendMessage(this, message);
    }
}
