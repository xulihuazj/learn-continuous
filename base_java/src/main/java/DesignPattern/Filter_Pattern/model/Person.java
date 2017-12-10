/*
 * Person.java 1.0.0 2017/12/2  23:37 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  23:37 created by xulihua
 */
package DesignPattern.Filter_Pattern.model;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/2 23:37
 */
public class Person {

    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}
