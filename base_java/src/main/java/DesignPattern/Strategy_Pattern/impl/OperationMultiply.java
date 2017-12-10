/*
 * OperationMultiply.java 1.0.0 2017/12/3  17:03 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  17:03 created by xulihua
 */
package DesignPattern.Strategy_Pattern.impl;

import DesignPattern.Strategy_Pattern.Strategy;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 17:03
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}