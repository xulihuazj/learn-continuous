/*
 * InnerClassTest.java 1.0.0 2017/10/29  21:55 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/10/29  21:55 created by xulihua
 */
package anonymous;

import java.util.Objects;
import java.util.Optional;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/10/29 21:55
 */
public class InnerClassTest {

    /**
     * 加法
     */
    public static double add(int a, int b) {

        /**
         * 匿名内部类实现加法
         */
        double c = new OperationService() {
            @Override
            public double operateTwoIntNum(int a, int b) {
                return a + b;
            }
        }.operateTwoIntNum(a, b);
        return c;
    }

    /**
     * 减法
     *
     * @param a
     * @param b
     * @return
     */
    public static double subtract(int a, int b) {
        /**
         * 匿名内部类实现加法
         */
        double c = new OperationService() {
            @Override
            public double operateTwoIntNum(int a, int b) {
                return a - b;
            }
        }.operateTwoIntNum(a, b);
        return c;
    }

    public static void main(String[] args) {

        Integer a = 1;
        Integer b = 2;
        Objects.equals(a,b);

        String was = null;

        System.out.println(subtract(10, 3));
    }
}
