/*
 * NullCustomer.java 1.0.0 2017/12/3  16:37 
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
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}