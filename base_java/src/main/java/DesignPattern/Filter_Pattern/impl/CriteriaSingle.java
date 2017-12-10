/*
 * CriteriaSingle.java 1.0.0 2017/12/2  23:41 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  23:41 created by xulihua
 */
package DesignPattern.Filter_Pattern.impl;

import DesignPattern.Filter_Pattern.Criteria;
import DesignPattern.Filter_Pattern.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:过滤出 Person对象中，婚姻状态是单身的person列表
 * @Author: xulihua
 * @date: 2017/12/2 23:41
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("单身")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
