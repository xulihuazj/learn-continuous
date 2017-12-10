/*
 * VegBurger.java 1.0.0 2017/12/2  21:26 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  21:26 created by xulihua
 */
package DesignPattern.Builder_Pattern.impl;

import DesignPattern.Builder_Pattern.Burger;

/**
 * @Description:蔬菜汉堡
 * @Author: xulihua
 * @date: 2017/12/2 21:26
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
