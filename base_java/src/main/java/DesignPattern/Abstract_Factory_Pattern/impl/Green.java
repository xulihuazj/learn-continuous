/*
 * Green.java 1.0.0 2017/12/2  16:54 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  16:54 created by xulihua
 */
package DesignPattern.Abstract_Factory_Pattern.impl;

import DesignPattern.Abstract_Factory_Pattern.Color;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/2 16:54
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
