/*
 * FilterChain.java 1.0.0 2017/12/3  18:28 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/3  18:28 created by xulihua
 */
package DesignPattern.Intercepting_Filter_Pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/3 18:28
 */
public class FilterChain {

    private List<Filter> filters = new ArrayList<>();

    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void setTarget(Target target){
        this.target = target;
    }

    public void execute(String request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

}
