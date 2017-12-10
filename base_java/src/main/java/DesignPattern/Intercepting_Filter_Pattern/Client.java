/*
 * Client.java 1.0.0 2017/12/3  18:30 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  18:30 created by xulihua
 */
package DesignPattern.Intercepting_Filter_Pattern;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 18:30
 */
public class Client {

    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
