/*
 * Target.java 1.0.0 2017/12/3  18:27 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  18:27 created by xulihua
 */
package DesignPattern.Intercepting_Filter_Pattern;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 18:27
 */
public class Target {

    public void execute(String request) {
        System.out.println("执行日志: " + request);
    }

}