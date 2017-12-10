/*
 * User.java 1.0.0 2017/12/3  15:16 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  15:16 created by xulihua
 */
package DesignPattern.Mediator_Pattern;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 15:16
 */
public class User {

    //用户名称
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}