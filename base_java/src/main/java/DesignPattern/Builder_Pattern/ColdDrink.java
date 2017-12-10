/*
 * ColdDrink.java 1.0.0 2017/12/2  21:26 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  21:26 created by xulihua
 */
package DesignPattern.Builder_Pattern;

import DesignPattern.Builder_Pattern.impl.Bottle;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/2 21:26
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}