/*
 * CriteriaMale.java 1.0.0 2017/12/2  23:39 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  23:39 created by xulihua
 */
package DesignPattern.Filter_Pattern.impl;

import DesignPattern.Filter_Pattern.Criteria;
import DesignPattern.Filter_Pattern.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:创建实现了 Criteria 接口的实体类。
 * @Author: xulihua
 * @date: 2017/12/2 23:39
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            //过滤器，过滤出 person 对象 性别为男的列表
            if(person.getGender().equalsIgnoreCase("男性")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
