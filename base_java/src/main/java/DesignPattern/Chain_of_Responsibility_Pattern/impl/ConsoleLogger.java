/*
 * ConsoleLogger.java 1.0.0 2017/12/3  12:34 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  12:34 created by xulihua
 */
package DesignPattern.Chain_of_Responsibility_Pattern.impl;

import DesignPattern.Chain_of_Responsibility_Pattern.AbstractLogger;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/3 12:34
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("标准 Console::Logger: " + message);
    }
}
