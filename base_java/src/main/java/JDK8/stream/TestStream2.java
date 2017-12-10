/*
 * TestStream２.java 1.0.0 2017/12/9  15:03
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/9  15:03 created by xulihua
 */
package JDK8.stream;

import JDK8.EmployeeModel;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/9 15:03
 */
public class TestStream2 {
    List<EmployeeModel> employeeModelList = Arrays.asList(
            new EmployeeModel("张三", "23", "male"),
            new EmployeeModel("王五", "23", "male"),
            new EmployeeModel("李四", "24", "female"),
            new EmployeeModel("招儿", "23", "female")
    );

    /**
     * 刷选与切片：
     * filter - 接收Lambda，从流中排出某些元素
     * limit - 截断流，使其元素不超过给定的数量
     * skip(n)－跳过元素，返回一个扔掉了前n个元素的流。
     * 若流中元素不足n个，则返回一个空，与limit(n)互补
     * distinct-刷选，通过流所生成元素的hashCode()和equals()去除重复元素
     */
    @Test
    public void test1() {
        //中间操作：不会执行任何操作
        Stream<EmployeeModel> modelStrema = employeeModelList.stream().filter(employeeModel ->
                {
                    System.out.println("******************");
                    return employeeModel.getAge().equals("23");
                }
        );
        //终止操作：一次性执行全部内容，即“惰性呢求职、延迟执行”
        modelStrema.forEach(System.out::println);
    }

    //流式短路
    @Test
    public void test2() {
        employeeModelList.stream().filter(employeeModel -> employeeModel.getAge().equals("23")).limit(2)
                .forEach(System.out::println);
    }

    //skip
    @Test
    public void test3() {
        employeeModelList.stream().filter(employeeModel -> employeeModel.getAge().equals("23"))
                .skip(1)
                .forEach(System.out::println);
    }

    //distinct
    @Test
    public void test4() {
        employeeModelList.stream().filter(employeeModel -> employeeModel.getAge().equals("23"))
                .distinct()
                .forEach(System.out::println);
    }

    /**
     * Map映射
     * map -　接收Lambda,将元素转换成其他形式或提取信息。结合艘一个函数作为，
     * 该函数会被应用到每个元素上，并将其映射到一个新的元素
     * 　flatMap －　接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流
     */
    @Test
    public void test5() {
        List<String> strList = Arrays.asList("aaa", "bbb", "cccc");
        strList.stream().map(str -> str.toUpperCase()).forEach(System.out::println);

        System.out.println("***************************************");

        employeeModelList.stream().map(EmployeeModel::getName).forEach(System.out::println);

        System.out.println("***************************************");

        Stream<Stream<Character>> streamStream = strList.stream().map(TestStream2::filter);
        streamStream.forEach(stream -> stream.forEach(System.out::println));

        System.out.println("***************************************");
        Stream<Character> stream = strList.stream().flatMap(TestStream2::filter);
        stream.forEach(System.out::println);

    }

    public static Stream<Character> filter(String str) {
        List<Character> characterList = new ArrayList<>(str.length());
        for (Character ch : str.toCharArray()) {
            characterList.add(ch);
        }
        return characterList.stream();
    }

    /**
     * 中间操作
     * 排序
     * sorted() -　自然排序
     * sorted(Comparator com) －定制排序
     */
    @Test
    public void test7() {
        List<String> strList = Arrays.asList("aaa", "bbb", "cccc", "eeeee");
        strList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        employeeModelList.stream()
                .sorted((e1, e2) -> {
                    if (e1.getAge().equals(e2.getAge())) {
                        return e1.getName().compareTo(e2.getName());
                    } else {
                        return e1.getAge().compareTo(e2.getAge());
                    }
                }).map(EmployeeModel::getName)
                .forEach(System.out::println);
    }

}
