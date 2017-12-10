/*
 * Employee.java 1.0.0 2017/12/9  0:22 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/9  0:22 created by xulihua
 */
package JDK8;

import java.util.Objects;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/9 0:22
 */
public class EmployeeModel {

    private String name;

    private String age;

    private String gender;

    private Status status;

    public EmployeeModel() {
    }

    public EmployeeModel(String name, String age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public EmployeeModel(String name, String age, String gender,Status status) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.status = status;
    }


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeModel that = (EmployeeModel) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(age, that.age) &&
                Objects.equals(gender, that.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    public enum Status{
        FREE,
        BUSY,
        VOCATION;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", status=" + status +
                '}';
    }
}
