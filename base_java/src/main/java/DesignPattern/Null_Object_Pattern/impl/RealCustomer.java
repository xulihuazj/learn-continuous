/*
 * RealCustomer.java 1.0.0 2017/12/3  16:37 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  16:37 created by xulihua
 */
package DesignPattern.Null_Object_Pattern.impl;

import DesignPattern.Null_Object_Pattern.AbstractCustomer;

/**
 * @Description:创建扩展了上述类的实体类。
 * @author: xulihua
 * @date: 2017/12/3 16:37
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}