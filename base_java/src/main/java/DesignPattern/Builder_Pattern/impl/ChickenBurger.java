/*
 * ChickenBurger.java 1.0.0 2017/12/2  21:27 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  21:27 created by xulihua
 */
package DesignPattern.Builder_Pattern.impl;

import DesignPattern.Builder_Pattern.Burger;

/**
 * @Description:鸡肉汉堡包
 * @Author: xulihua
 * @date: 2017/12/2 21:27
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}