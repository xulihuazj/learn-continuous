/*
 * AbstractLogger.java 1.0.0 2017/12/3  12:26 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  12:26 created by xulihua
 */
package DesignPattern.Chain_of_Responsibility_Pattern;

/**
 * @Description:创建抽象的记录器类。
 * @Author: xulihua
 * @date: 2017/12/3 12:26
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    //责任链中的下一个元素
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if(this.level <= level){
            write(message);
        }
        //如果下一个 日志记录器不为空，就继续 将信息往下 传
        if(nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);

}
