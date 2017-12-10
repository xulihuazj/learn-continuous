/*
 * Circle.java 1.0.0 2017/12/2  16:53 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  16:53 created by xulihua
 */
package DesignPattern.Abstract_Factory_Pattern.impl;

import DesignPattern.Abstract_Factory_Pattern.Shape;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/2 16:53
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
