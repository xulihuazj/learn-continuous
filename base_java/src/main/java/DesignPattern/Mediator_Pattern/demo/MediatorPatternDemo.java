/*
 * MediatorPatternDemo.java 1.0.0 2017/12/3  15:17 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  15:17 created by xulihua
 */
package DesignPattern.Mediator_Pattern.demo;

import DesignPattern.Mediator_Pattern.User;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 15:17
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}