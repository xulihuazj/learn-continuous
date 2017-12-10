/*
 * Rectangle.java 1.0.0 2017/12/3  11:17 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  11:17 created by xulihua
 */
package DesignPattern.Facade_Pattern.impl;

import DesignPattern.Facade_Pattern.Shape;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/3 11:17
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("画一个长方形");
    }
}