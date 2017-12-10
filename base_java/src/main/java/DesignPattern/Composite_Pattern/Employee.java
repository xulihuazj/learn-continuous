/*
 * Employee.java 1.0.0 2017/12/2  23:59 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/2  23:59 created by xulihua
 */
package DesignPattern.Composite_Pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/12/2 23:59
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee() {
    }

    //构造函数
    public Employee(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    public Employee(int sal) {
        this.salary = sal;
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return ("Employee :[ Name : " + name
                + ", dept : " + dept + ", salary :"
                + salary + " ]");
    }
}
