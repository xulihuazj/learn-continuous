/*
 * Circle.java 1.0.0 2017/12/3  11:18 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  11:18 created by xulihua
 */
package DesignPattern.Facade_Pattern.impl;

import DesignPattern.Facade_Pattern.Shape;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/3 11:18
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("画一个圆环");
    }
}