/*
 * TestStream1.java 1.0.0 2017/12/9  14:43 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/9  14:43 created by xulihua
 */
package JDK8.stream;

import JDK8.EmployeeModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 一：Stream 的三个操作步骤：
 * 1:创建Stream
 * 2:中间操作
 * 3:终止操作（终端操作）
 *
 * @Description:
 * @author: xulihua
 * @date: 2017/12/9 14:43
 */
public class TestStream1 {
    //1：可以 通过Collection 系列集合提供的Stream(0 或者 parallelStream()
    List<String> strList = new ArrayList<>();
    Stream<String> stream1 = strList.stream();

    //2：通过Arrays 中的静态方法　Stream() 获取数组流
    EmployeeModel[] emps = new EmployeeModel[10];
    Stream<EmployeeModel> stream2 = Arrays.stream(emps);

    //３：通过stream 类中的静态方法 of()
    Stream<String> stream3 = Stream.of("a", "b", "c");

    //４：创建无限流
    Stream<Integer> stream4 = Stream.iterate(0, (x) -> x + 2);

}
