/*
 * Criteria.java 1.0.0 2017/12/2  23:36 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  23:36 created by xulihua
 */
package DesignPattern.Filter_Pattern;

import DesignPattern.Filter_Pattern.model.Person;

import java.util.List;

/**
 * @Description:为标准（Criteria）创建一个接口。
 * @Author: xulihua
 * @date: 2017/12/2 23:36
 */
public interface Criteria {

    //过滤器模式，过滤列表
    List<Person> meetCriteria(List<Person> persons);
}
