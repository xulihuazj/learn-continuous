/*
 * Bottle.java 1.0.0 2017/12/2  21:10 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  21:10 created by xulihua
 */
package DesignPattern.Builder_Pattern.impl;

import DesignPattern.Builder_Pattern.Packing;

/**
 * @Description:瓶子
 * @author: xulihua
 * @date: 2017/12/2 21:10
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
