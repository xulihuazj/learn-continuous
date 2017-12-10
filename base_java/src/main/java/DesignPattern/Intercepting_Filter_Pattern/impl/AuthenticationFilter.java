/*
 * AuthenticationFilter.java 1.0.0 2017/12/3  18:26 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  18:26 created by xulihua
 */
package DesignPattern.Intercepting_Filter_Pattern.impl;

import DesignPattern.Intercepting_Filter_Pattern.Filter;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 18:26
 */
public class AuthenticationFilter implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("认证请求日志: " + request);
    }
}