/*
 * TestOptional.java 1.0.0 2017/12/9  17:25 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/9  17:25 created by xulihua
 */
package JDK8.optional;

import JDK8.EmployeeModel;
import org.junit.Test;

import java.util.Optional;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/9 17:25
 */
public class TestOptional {


    /**
     * Optional 容器类的常用方法：
     * Optional.of(T t)：创建一个Optional实例
     * Optional.empty()：创建一个空的Optional实例
     * Optional.ofNullable(T t)：若t不为null,创建Optional实例，否则创建空实例
     * isPresent()：判断是否包含值
     * orElse(T t)：如果调用对象包含值，返回该值，否则返回t
     * orElseGet(Supplier s)
     * map(Function f)
     * flatMap(Funcation mapper)：与map 类似
     */
    @Test
    public void test1() {
        Optional<EmployeeModel> employeeModelOptional = Optional.of(new EmployeeModel());
        System.out.println(employeeModelOptional.get());
    }

    @Test
    public void test2() {
        EmployeeModel employeeModel = (EmployeeModel) Optional.ofNullable(null)
                .orElse(new EmployeeModel("AAA", "24", "famle"));

        EmployeeModel employeeModel2 = (EmployeeModel) Optional.ofNullable(null)
                .orElseGet(() -> {
                    return new EmployeeModel();
                });
    }


}
