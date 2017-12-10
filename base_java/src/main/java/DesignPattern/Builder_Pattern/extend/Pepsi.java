/*
 * Pepsi.java 1.0.0 2017/12/2  21:29 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  21:29 created by xulihua
 */
package DesignPattern.Builder_Pattern.extend;

import DesignPattern.Builder_Pattern.ColdDrink;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/2 21:29
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
