/*
 * LambdaTest4.java 1.0.0 2017/12/9  14:05 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/9  14:05 created by xulihua
 */
package JDK8.lambda;

import DesignPattern.Composite_Pattern.Employee;
import org.junit.Test;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 *
 * 注意：
 *      1：Lambda 体中调用方法的参数列表与返回类型，
 *         要与函数式接口中抽象方法的函数列表和返回值类型保持一致
 * @Description:
 * @author: xulihua
 * @date: 2017/12/9 14:05
 */
public class LambdaTest4 {

    //数组引用
    @Test
    public void test6(){
        Function<Integer,String[]> function = (x)->new String[x];
        String[] apply = function.apply(10);
        System.out.println(apply.length);

        Function<Integer,String[]> function2 = String[]::new;
        String[] apply1 = function2.apply(20);
        System.out.println(apply1.length);
    }

    //构造器引用
    @Test
    public void test5(){
        Supplier<Employee> supEmployee = () -> new Employee();
        //构造器引用方式
        Supplier<Employee> supEmployee2 = Employee::new;
        Employee employee = supEmployee2.get();
        System.out.println(employee);

        Function<Integer,Employee> supEmploye3 = Employee::new;

    }

  //类::实例方法名
    @Test
    public void test4(){
        BiPredicate<String,String> bp = (x,y) -> x.equals(y);
        BiPredicate<String,String> bp2 = String::equals;
    }

    //类::静态方法名
    @Test
    public void test3(){

    }

}
