/*
 * Rectangle.java 1.0.0 2017/12/2  16:52 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  16:52 created by xulihua
 */
package DesignPattern.Abstract_Factory_Pattern.impl;

import DesignPattern.Abstract_Factory_Pattern.Shape;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/2 16:52
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside impl::draw() method.");
    }
}
