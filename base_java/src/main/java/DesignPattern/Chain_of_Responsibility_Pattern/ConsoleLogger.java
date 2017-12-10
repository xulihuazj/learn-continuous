/*
 * ConsoleLogger.java 1.0.0 2017/12/3  12:30 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  12:30 created by xulihua
 */
package DesignPattern.Chain_of_Responsibility_Pattern;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/3 12:30
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
