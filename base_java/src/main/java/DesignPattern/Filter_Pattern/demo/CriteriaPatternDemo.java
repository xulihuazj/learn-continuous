/*
 * CriteriaPatternDemo.java 1.0.0 2017/12/2  23:46 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  23:46 created by xulihua
 */
package DesignPattern.Filter_Pattern.demo;

import DesignPattern.Filter_Pattern.Criteria;
import DesignPattern.Filter_Pattern.impl.*;
import DesignPattern.Filter_Pattern.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/2 23:46
 */
public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Robert", "男性", "单身"));
        persons.add(new Person("John", "男性", "已结婚"));
        persons.add(new Person("Laura", "女性", "已结婚"));
        persons.add(new Person("Diana", "女性", "单身"));
        persons.add(new Person("Mike", "男性", "单身"));
        persons.add(new Person("Bobby", "男性", "单身"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("男性: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("女性Females: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("单身 and 男性: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("单身 or 女性： ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    + ", Gender : " + person.getGender()
                    + ", Marital Status : " + person.getMaritalStatus()
                    + " ]");
        }
    }
}
