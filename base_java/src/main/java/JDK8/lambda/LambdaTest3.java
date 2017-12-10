/*
 * LambdaTest3.java 1.0.0 2017/12/9  9:45
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/9  9:45 created by xulihua
 */
package JDK8.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Java8 内置的四大核心函数式接口
 * 1:Consumer<T>: 消费性接口
 * void accept(T t);
 * 2:Suppllier<t>:供给性接口
 * T get();
 * 3:Function<T,R>：函数式接口
 * R apply(T t);
 * 4：Predicate<T>：断言性接口
 * boolean test(T t);
 *
 * @Description:
 * @author: xulihua
 * @date: 2017/12/9 9:45
 */
public class LambdaTest3 {


    //1:消费性接口
    @Test
    public void test() {
        shopping(1000, (m) -> System.out.println("吃饭。。。共花费：{0}" + m + "元"));
    }

    public void shopping(double money, Consumer<Double> consumer) {
        consumer.accept(money);
    }

    //2:供给性接口
    @Test
    public void test2() {
        List<Integer> numList = getNumList(10, () ->
                (int) Math.random() * 100);
        numList.forEach(num -> {
            System.out.println(num);
        });
    }

    public List<Integer> getNumList(int num, Supplier<Integer> sup) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Integer integer = sup.get();
            integerList.add(integer);
        }
        return integerList;
    }

    //3:函数性接口
    @Test
    public void test3() {
        String s = strHandler("aa,aa,aa", (str) -> {
            str.trim();
            String substring = str.substring(0, 2);
            return substring;
        });
        System.out.println(s);
    }

    public String strHandler(String str, Function<String, String> function) {
        return function.apply(str);
    }


    //4:断言性接口
    @Test
    public void test4() {
        List<String> stringList = Arrays.asList("aaa", "bbbb", "cccccc");
        List<String> strList = filterStr(stringList, str ->
                str.length() > 2
        );
        strList.forEach(str -> {
            System.out.println();
            System.out.println(str);
        });

    }

    //将满足条件的字符串放入集合中
    public List<String> filterStr(List<String> list, Predicate<String> predicate) {
        List<String> strList = new ArrayList<>();
        for (String str : strList) {
            if (predicate.test(str)) {
                strList.add(str);
            }
        }
        return strList;
    }

}
