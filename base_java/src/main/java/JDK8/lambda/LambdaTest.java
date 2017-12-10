/*
 * LambdaTest.java 1.0.0 2017/12/9  0:02 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/9  0:02 created by xulihua
 */
package JDK8.lambda;

import JDK8.EmployeeModel;
import org.junit.Test;

import java.util.*;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/9 0:02
 */
public class LambdaTest {

    @Test
    public void test1() {
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        TreeSet<Integer> ts = new TreeSet<>(com);
    }

    @Test
    public void test2() {
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
        TreeSet<Integer> ts = new TreeSet<>(com);
    }

    List<EmployeeModel> employeeModelList = Arrays.asList(
            new EmployeeModel("张三", "23", "male"),
            new EmployeeModel("王五", "23", "male"),
            new EmployeeModel("李四", "24", "female"),
            new EmployeeModel("招儿", "23", "female")
    );

    @Test
    public void test3(){
        employeeModelList.stream().filter(employeeModel -> employeeModel.getAge().equals("23"))
                .map(employeeModel -> employeeModel.getName())
                .forEach(System.out::println);
    }

}
