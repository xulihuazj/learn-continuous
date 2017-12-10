/*
 * ChatRoom.java 1.0.0 2017/12/3  15:16 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  15:16 created by xulihua
 */
package DesignPattern.Mediator_Pattern;

import java.util.Date;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 15:16
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {

        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
