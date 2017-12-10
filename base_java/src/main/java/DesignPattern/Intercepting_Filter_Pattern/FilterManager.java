/*
 * FilterManager.java 1.0.0 2017/12/3  18:29 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  18:29 created by xulihua
 */
package DesignPattern.Intercepting_Filter_Pattern;

/**
 * @Description:创建过滤管理器。
 * @author: xulihua
 * @date: 2017/12/3 18:29
 */
public class FilterManager {

    FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}
