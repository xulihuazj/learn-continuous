/*
 * Burger.java 1.0.0 2017/12/2  21:25 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  21:25 created by xulihua
 */
package DesignPattern.Builder_Pattern;

import DesignPattern.Builder_Pattern.impl.Wrapper;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/2 21:25
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
