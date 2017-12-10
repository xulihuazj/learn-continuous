/*
 * EnumTest.java 1.0.0 2017/11/25  23:55 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/11/25  23:55 created by xulihua
 */
package common;

import org.junit.Test;

/**
 * @Description:
 * @Author: xulihua
 * @date: 2017/11/25 23:55
 */
public class EnumTest {

    @Test
    public void test1(){


        String  aaa = null;
        OrderCurrentStatusEnum orderStatus = OrderCurrentStatusEnum.valueOf(aaa
        );
        System.out.print(orderStatus);

    }
}
