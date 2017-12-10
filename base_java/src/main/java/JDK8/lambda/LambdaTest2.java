/*
 * LambdaTest2.java 1.0.0 2017/12/9  0:33 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/9  0:33 created by xulihua
 */
package JDK8.lambda;

import org.junit.Test;

/**
 * 一、Lambda 变大师的基础语法：java8中
 *
 * @Description:
 * @author: xulihua
 * @date: 2017/12/9 0:33
 */
public class LambdaTest2 {

    @Test
    public void test1() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Lambda!");
            }
        };
        runnable.run();
    }

    @Test
    public void test2() {
        Runnable runnable = () -> {
            System.out.println("Hello Lambda!");
        };
        runnable.run();
    }

}
