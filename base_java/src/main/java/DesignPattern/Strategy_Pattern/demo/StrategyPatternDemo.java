/*
 * StrategyPatternDemo.java 1.0.0 2017/12/3  17:09 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  17:09 created by xulihua
 */
package DesignPattern.Strategy_Pattern.demo;

import DesignPattern.Strategy_Pattern.Context;
import DesignPattern.Strategy_Pattern.impl.OperationAdd;
import DesignPattern.Strategy_Pattern.impl.OperationMultiply;
import DesignPattern.Strategy_Pattern.impl.OperationSubstract;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 17:09
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());

        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}