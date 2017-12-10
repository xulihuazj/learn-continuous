/*
 * CriteriaFemale.java 1.0.0 2017/12/2  23:40 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  23:40 created by xulihua
 */
package DesignPattern.Filter_Pattern.impl;

import DesignPattern.Filter_Pattern.Criteria;
import DesignPattern.Filter_Pattern.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:过滤出Person 对象中，性别为女的列表
 * @Author: xulihua
 * @date: 2017/12/2 23:40
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("女性")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
