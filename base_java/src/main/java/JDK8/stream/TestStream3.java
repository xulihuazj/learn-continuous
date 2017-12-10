/*
 * TestStream3.java 1.0.0 2017/12/9  15:57 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/9  15:57 created by xulihua
 */
package JDK8.stream;

import JDK8.EmployeeModel;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/9 15:57
 */
public class TestStream3 {

    List<EmployeeModel> employeeModelList = Arrays.asList(
            new EmployeeModel("张三", "23", "male", EmployeeModel.Status.FREE),
            new EmployeeModel("王五", "23", "male", EmployeeModel.Status.BUSY),
            new EmployeeModel("李四", "24", "female", EmployeeModel.Status.FREE),
            new EmployeeModel("招儿", "23", "female", EmployeeModel.Status.VOCATION)
    );

    /**
     * 　查找与匹配
     * allMatch - 检查是否匹配所有元素
     * anyMatch - 检查是否至少匹配一个元素
     * noneMatch - 检查是否匹配所有元素
     * findFirst - 返回第一个元素
     * findAny - 返回当前流中的任意元素
     * count - 返回流中元素的总个数
     * max - 返回流中最大值
     * min - 返回流中最小值
     */
    @Test
    public void test1() {
        boolean flag1 = employeeModelList.stream()
                .allMatch(employeeModel -> employeeModel.getStatus().equals(EmployeeModel.Status.BUSY));
        System.out.println(flag1);

        System.out.println("************************************************************");
        boolean flag2 = employeeModelList.stream()
                .anyMatch(employeeModel -> employeeModel.getStatus().equals(EmployeeModel.Status.BUSY));
        System.out.println(flag2);
        System.out.println("************************************************************");

        Optional<EmployeeModel> employeeModelOptional = employeeModelList.stream()
                .findFirst();
        if (employeeModelOptional.isPresent()) {
            EmployeeModel employeeModel = employeeModelOptional.get();
            System.out.println(employeeModel.getName());
        }
    }

    /**
     * 规约
     */
    @Test
    public void test2() {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        Integer reduce = integerList.stream()
                .reduce(0, (x, y) -> x + y);
        System.out.println(reduce);
    }

    List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

    /**
     * 收集
     */
    @Test
    public void test3() {

        Integer reduce = integerList.stream()
                .reduce(0, (x, y) -> x + y);
        System.out.println(reduce);

        List<String> nameList = employeeModelList.stream()
                .map(EmployeeModel::getName)
                .collect(Collectors.toList());
        nameList.forEach(System.out::println);

        Set<String> nameSet2 = employeeModelList.stream()
                .map(EmployeeModel::getName)
                .collect(Collectors.toSet());

        HashSet<String> hashSetStr = employeeModelList.stream()
                .map(EmployeeModel::getName)
                .collect(Collectors.toCollection(HashSet::new));

        //平均值
/*     Integer a =    integerList.stream()
                .collect(Collectors.averagingInt());*/

    }

    /**
     * 分组
     */
    @Test
    public void test4() {
        Map<EmployeeModel.Status, List<EmployeeModel>> map =
                employeeModelList.stream()
                        .collect(Collectors.groupingBy(EmployeeModel::getStatus));
        System.out.println(map);

        //多级分组

        Map<EmployeeModel.Status, Map<String, List<EmployeeModel>>> map2 =
                employeeModelList.stream()
                        .collect(Collectors.groupingBy(EmployeeModel::getStatus, Collectors.groupingBy(EmployeeModel::getAge)));
        System.out.println(map2);
    }


}
