/*
 * Circle.java 1.0.0 2017/12/3  0:04 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  0:04 created by xulihua
 */
package DesignPattern.Decorator_Pattern.impl;

import DesignPattern.Decorator_Pattern.Shape;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/3 0:04
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
