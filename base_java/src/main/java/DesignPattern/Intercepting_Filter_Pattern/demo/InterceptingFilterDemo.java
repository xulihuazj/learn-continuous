/*
 * InterceptingFilterDemo.java 1.0.0 2017/12/3  18:30 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  18:30 created by xulihua
 */
package DesignPattern.Intercepting_Filter_Pattern.demo;

import DesignPattern.Intercepting_Filter_Pattern.Client;
import DesignPattern.Intercepting_Filter_Pattern.FilterManager;
import DesignPattern.Intercepting_Filter_Pattern.Target;
import DesignPattern.Intercepting_Filter_Pattern.impl.AuthenticationFilter;
import DesignPattern.Intercepting_Filter_Pattern.impl.DebugFilter;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 18:30fs
 */
public class InterceptingFilterDemo {

    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}