/*
 * ChainPatternDemo.java 1.0.0 2017/12/3  12:34 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  12:34 created by xulihua
 */
package DesignPattern.Chain_of_Responsibility_Pattern;

import DesignPattern.Chain_of_Responsibility_Pattern.impl.ErrorLogger;
import DesignPattern.Chain_of_Responsibility_Pattern.impl.FileLogger;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/3 12:34
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}