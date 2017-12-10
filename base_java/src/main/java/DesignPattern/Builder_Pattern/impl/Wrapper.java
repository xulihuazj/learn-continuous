/*
 * Wrapper.java 1.0.0 2017/12/2  21:09 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  21:09 created by xulihua
 */
package DesignPattern.Builder_Pattern.impl;

import DesignPattern.Builder_Pattern.Packing;

/**
 * @Description:包装
 * @Author: xulihua
 * @date: 2017/12/2 21:09
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
