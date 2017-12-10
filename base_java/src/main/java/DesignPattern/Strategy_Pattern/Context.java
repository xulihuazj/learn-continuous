/*
 * Context.java 1.0.0 2017/12/3  17:08 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  17:08 created by xulihua
 */
package DesignPattern.Strategy_Pattern;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 17:08
 */
public class Context {
    //获取策略引用
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
