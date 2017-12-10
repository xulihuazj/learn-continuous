/*
 * OrCriteria.java 1.0.0 2017/12/2  23:45 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  23:45 created by xulihua
 */
package DesignPattern.Filter_Pattern.impl;

import DesignPattern.Filter_Pattern.Criteria;
import DesignPattern.Filter_Pattern.model.Person;

import java.util.List;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/2 23:45
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for (Person person : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
