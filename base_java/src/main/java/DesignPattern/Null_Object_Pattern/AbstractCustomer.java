/*
 * AbstractCustomer.java 1.0.0 2017/12/3  16:36 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  16:36 created by xulihua
 */
package DesignPattern.Null_Object_Pattern;

/**
 * @Description:创建一个抽象类。
 * @author: xulihua
 * @date: 2017/12/3 16:36
 */
public abstract class AbstractCustomer {

    //名称
    protected String name;

    public abstract boolean isNil();

    public abstract String getName();
}
