/*
 * NullPatternDemo.java 1.0.0 2017/12/3  16:39 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  16:39 created by xulihua
 */
package DesignPattern.Null_Object_Pattern.demo;

import DesignPattern.Null_Object_Pattern.AbstractCustomer;
import DesignPattern.Null_Object_Pattern.CustomerFactory;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 16:39
 */
public class NullPatternDemo {

    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
