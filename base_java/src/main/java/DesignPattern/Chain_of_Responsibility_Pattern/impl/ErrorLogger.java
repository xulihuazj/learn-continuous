/*
 * ErrorLogger.java 1.0.0 2017/12/3  12:31 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  12:31 created by xulihua
 */
package DesignPattern.Chain_of_Responsibility_Pattern.impl;

import DesignPattern.Chain_of_Responsibility_Pattern.AbstractLogger;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/3 12:31
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error级别错误日志 Console::Logger: " + message);
    }
}

