/*
 * Rectangle.java 1.0.0 2017/12/3  0:03 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  0:03 created by xulihua
 */
package DesignPattern.Decorator_Pattern.impl;

import DesignPattern.Decorator_Pattern.Shape;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/3 0:03
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
