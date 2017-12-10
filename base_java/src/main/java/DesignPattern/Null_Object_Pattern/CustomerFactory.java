/*
 * CustomerFactory.java 1.0.0 2017/12/3  16:39 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  16:39 created by xulihua
 */
package DesignPattern.Null_Object_Pattern;

import DesignPattern.Null_Object_Pattern.impl.NullCustomer;
import DesignPattern.Null_Object_Pattern.impl.RealCustomer;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 16:39
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
